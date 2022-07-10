package HW.task_001_phones;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File file = new File("./src/HW/task_001_phones/file.txt");

        try(FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            StringBuilder sb = new StringBuilder();
            for (byte b : buffer) {
                sb.append((char) b);
            }
            String [] phones = sb.toString().split("\n");
            System.out.println("phones.length = " + phones.length);
            System.out.println("phones[0] = " + phones[0]);
            System.out.println("phones[1] = " + phones[1]);
            System.out.println("phones[2] = " + phones[2]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
