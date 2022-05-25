package ua.goit.mod_009.lesson_002_inp_outp_stream_wrap;

import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {
    public static void main(String[] args) throws IOException {
        byte[] input = new byte[]{1, 2, 90, 127, 125};
        java.io.InputStream stream = new java.io.InputStream() {
            private int index = 0 ;
            @Override
            public int read() throws IOException {
                if(this.index == input.length){
                    return -1;
                }
                byte result = input[this.index];
                this.index++;
                return result;
            }
        };

//        int data = stream.read();
//
//        while (data != -1){
//            System.out.println(data);
//            data = stream.read();
//        }

        byte[] out = new byte[input.length];
        stream.read(out);
        System.out.println(Arrays.toString(out));
    }
}
