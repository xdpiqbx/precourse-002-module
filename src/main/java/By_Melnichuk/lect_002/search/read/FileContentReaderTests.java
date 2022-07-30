package By_Melnichuk.lect_002.search.read;

import java.io.File;

public class FileContentReaderTests {
    public static void main(String[] args) {
        String path = "./src/By_Melnichuk/lect_002/files/";
        FileContentReader contentReader = new ScannerContentReader();
        String content = contentReader.read(new File(path + "root.txt"));
        System.out.println(content);
    }
}
