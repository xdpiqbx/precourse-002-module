package ua.goit.HomeWork;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setRequestMethod("POST");
            connect.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            connect.setRequestProperty("Accept", "application/json; charset=UTF-8");
            connect.setDoOutput(true);

            String jsonInputString = "{\"id\": \"1\", \"name\": \"Boris\", \"email\": \"boris@gmail.com\", \"userId\": \"1\"}";
            try(OutputStream os = connect.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            try(BufferedReader br = new BufferedReader(
                    new InputStreamReader(connect.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine = null;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println(response.toString());
            }



//            InputStream inputStream = connect.getInputStream();
//            int responseCode = connect.getResponseCode();
//            System.out.println(responseCode);
//
//            byte[] bytes = inputStream.readAllBytes();
//            for (byte aByte : bytes) {
//                System.out.print((char)aByte);
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
