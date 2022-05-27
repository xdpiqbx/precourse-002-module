package ua.goit.mod_009.lesson_003_reder_writer_wraps;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReaderExample {
    private static final String BASE_PATH = "D:\\JAVA\\GOIT\\005 Tech Skills (precourse)\\precourse-java-goit";
    private static final String PROJ_PATH = "\\src\\main\\resources\\WriteReaderExample\\WriteRead.txt";
    private static final String ABS_PATH = BASE_PATH + PROJ_PATH;

    public static void main(String[] args) {
        File file = new File(ABS_PATH);
        checkIsFileAvailable(file);

        try(FileWriter writer = new FileWriter(file, true)){
            writer.write("Hello WriteReaderExample");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader(file)){
            int ch = reader.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = reader.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    private static void checkIsFileAvailable(File file) {
        if(!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}