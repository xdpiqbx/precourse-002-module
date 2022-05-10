package ua.goit.mod_5.lesson_004_exceptions_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtil_002 {
    public static void main(String[] args) {
        readFile("src/main/java/ua/goit/mod_5/lesson_004_exceptions_2/file.txt");
    }
    private static void readFile(String someFile){
        File file = new File(someFile);
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            System.out.println(reader.readLine());
            // System.exit(1); // no finally
            // Error Stack overflow, out of memory
            // Demon threads
        }catch(IOException e){
            System.out.println("Impossible to read file");
        }
    }
}
