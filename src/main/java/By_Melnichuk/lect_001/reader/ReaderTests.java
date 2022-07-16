package By_Melnichuk.lect_001.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class ReaderTests {
    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("Make Java great again!");
        while(reader.ready()){
            int code = reader.read();
            if(code < 0){
                break;
            }
            System.out.print((char)code);
        }
    }
}
