package ua.goit.mod_009.lesson_002_inp_outp_stream_wrap;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFileExample {
    public static void main(String[] args) {
        String absolutePath = "D:\\JAVA\\GOIT\\005 Tech Skills (precourse)\\precourse-java-goit\\src\\main\\resources\\file-001.txt";
        File file = new File(absolutePath);

        if(!file.exists()){
            throw new RuntimeException("Not found" + absolutePath);
        }

        try(FileInputStream inputStream = new FileInputStream(absolutePath)){
            int ch = inputStream.read();
            while(ch != -1){
                System.out.print((char) ch);
                ch = inputStream.read();
            }
        }catch (IOException e){
            System.err.print(e.getMessage());
        }
    }
}
// https://youtu.be/8crZa_fmNWM?t=2611