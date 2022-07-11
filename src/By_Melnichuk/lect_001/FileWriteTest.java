package By_Melnichuk.lect_001;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileWriteTest {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/main/resources/out/test.txt");
        OutputStream fos = new FileOutputStream(file);
        for (byte aByte : "Hello World!!!".getBytes(StandardCharsets.UTF_8)) {
            fos.write(aByte);
        }
        // fos.flush();
        fos.close();
    }
}
