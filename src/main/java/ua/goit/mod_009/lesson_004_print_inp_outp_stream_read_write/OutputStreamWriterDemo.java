package ua.goit.mod_009.lesson_004_print_inp_outp_stream_read_write;

import java.io.*;
import java.util.Arrays;

public class OutputStreamWriterDemo {

    public static void main(String[] args) throws IOException {
        try(ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(byteArray)){
            outputStreamWriter.write("My name is Max");
            outputStreamWriter.flush();
            System.out.println(byteArray.toString());
            System.out.println(Arrays.toString(byteArray.toByteArray()));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
