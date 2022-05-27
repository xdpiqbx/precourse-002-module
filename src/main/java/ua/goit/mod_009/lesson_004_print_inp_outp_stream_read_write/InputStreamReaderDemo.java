package ua.goit.mod_009.lesson_004_print_inp_outp_stream_read_write;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
    private static byte[] INPUT_BYTE_ARRAY = new byte[]{72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};

    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(new ByteArrayInputStream(INPUT_BYTE_ARRAY))){
            int read = reader.read();
            while(read != -1){
                System.out.print((char)read);
                read = reader.read();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
