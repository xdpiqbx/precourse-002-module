package By_Melnichuk.lect_001;

import java.io.*;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("./src/main/out.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readByte());
    }
}
