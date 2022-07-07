package By_Melnichuk.copy;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyPasterTests {
    public static void main(String[] args) throws IOException {
//        FileInputStream from = new FileInputStream("./src/main/resources/data.txt");
//        FileOutputStream to = new FileOutputStream("./src/main/resources/out/data-copy.txt");
//        CopyPaster copyPaster = new CopyPaster(from, to);
//        copyPaster.copy();

        String text = "This is my text in CopyPasterTest";
        new CopyPaster(
                new ByteArrayInputStream(text.getBytes(StandardCharsets.UTF_8)),
                new FileOutputStream("./src/main/resources/out/text-copy.txt")
        ).copy();
    }
}
