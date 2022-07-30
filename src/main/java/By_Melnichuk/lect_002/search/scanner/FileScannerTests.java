package By_Melnichuk.lect_002.search.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class FileScannerTests {
    public static void main(String[] args) throws IOException {
        String path = "./src/By_Melnichuk/lect_002/files/";
        FileScanner fileScanner = new RecursiveFileScanner();
        Collection<File> files = fileScanner.scan(new File(path));
        for (File file : files) {
            System.out.println("file.getCanonicalPath() = " + file.getCanonicalPath());
        }
    }
}
