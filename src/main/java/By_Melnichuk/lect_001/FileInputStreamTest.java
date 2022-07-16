package By_Melnichuk.lect_001;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/resources/data.txt");
        // System.out.println("file.exists() = " + file.exists());
        InputStream fileInputStream = new FileInputStream(file);
        Scanner scanner = new Scanner(fileInputStream);
        while(scanner.hasNextLine()){
            System.out.println("scanner.nextLine() = " + scanner.nextLine());
        }
        fileInputStream.close();
    }
}
