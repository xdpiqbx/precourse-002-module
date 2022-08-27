package ua.goit.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Fetch {
    private HttpURLConnection connect;

    public Fetch(String query, METHOD method) throws IOException {
        String baseUrl = "https://jsonplaceholder.typicode.com";
        URL url = new URL(baseUrl + query);
        connect = (HttpURLConnection) url.openConnection();
        connect.setRequestMethod(String.valueOf(method));
        connect.setConnectTimeout(40000);
        connect.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        connect.setRequestProperty("Accept", "application/json; charset=UTF-8");
        connect.setDoOutput(true);
    }

    public HttpURLConnection getConnect() {
        return connect;
    }

    public boolean addPayload(String json) throws IOException {
        try(OutputStream os = connect.getOutputStream()) {
            byte[] input = json.getBytes(StandardCharsets.UTF_8);
            os.write(input);
            return true;
        }
    }

    public String getResponseData() throws IOException {
        int httpStatusCode = connect.getResponseCode();
        String data = "";
        if(httpStatusCode > 199 && httpStatusCode < 300){
            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(connect.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                data = response.toString();
            }
        }
        return data;
    }

    public int responseStatusCode() throws IOException {
        return connect.getResponseCode();
    }

    public enum METHOD{
        POST, GET, PUT, DELETE;
    }
}
