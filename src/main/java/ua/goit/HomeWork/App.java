package ua.goit.HomeWork;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts");
            HttpURLConnection connect = (HttpURLConnection) url.openConnection();
            connect.setDoOutput(true);
            connect.setRequestMethod("POST");
            connect.setRequestProperty("Content-type", "application/json");
            InputStream inputStream = connect.getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            for (byte aByte : bytes) {
                System.out.print((char)aByte);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
