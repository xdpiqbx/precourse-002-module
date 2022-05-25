package ua.goit.mod_009.lesson_002_inp_outp_stream_wrap;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteToFileEx {
    public static void main(String[] args) {
        String absolutePath = "D:\\JAVA\\GOIT\\005 Tech Skills (precourse)\\precourse-java-goit\\src\\main\\resources\\out\\file-001.txt";
        File file = new File(absolutePath);
        if(!file.exists()){
            file.getParentFile().mkdirs();
            try{
               file.createNewFile();
            }catch(IOException e) {
                System.err.println(e.getMessage());
            }
        }
        try(FileOutputStream outputStream = new FileOutputStream(file)){
            String content = "This we will add to the file\nHello World";
            outputStream.write(content.getBytes());
        }catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
}
