package By_Melnichuk.lect_002.search;

import By_Melnichuk.lect_002.search.read.FileContentReader;
import By_Melnichuk.lect_002.search.scanner.RecursiveFileScanner;
import By_Melnichuk.lect_002.search.search.ContentSearcher;
import By_Melnichuk.lect_002.search.search.PrimitiveContentSearcher;
import By_Melnichuk.lect_002.search.read.ScannerContentReader;
import By_Melnichuk.lect_002.search.scanner.FileScanner;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class SearcherTests {
    public static void main(String[] args) throws IOException {
        FileScanner fileScanner = new RecursiveFileScanner();
        FileContentReader fileContentReader = new ScannerContentReader();
        ContentSearcher contentSearcher = new PrimitiveContentSearcher();

        String path = "./src/By_Melnichuk/lect_002/files/";

        File input = new File(path);
        String search = "child";

        Collection<File> files = fileScanner.scan(input);
        for (File file : files) {
            String content = fileContentReader.read(file);
            if(contentSearcher.search(content, search)){
                System.out.println("Found in: " + file.getCanonicalPath());
            }
        }
    }
}
