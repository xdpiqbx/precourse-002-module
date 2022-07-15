package By_Melnichuk.lect_002.search;

import java.io.File;
import java.io.IOException;

public class SearcherTests {
    public static void main(String[] args) throws IOException {
//        String path = "./src/By_Melnichuk/lect_002/files";
        String path = "./src/";
        String search = "in file root";
        File input = new File(path);
        new SearchEngine().searchAndPrintResults(input, search);
    }
}
