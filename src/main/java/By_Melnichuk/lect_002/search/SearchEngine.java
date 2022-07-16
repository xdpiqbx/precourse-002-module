package By_Melnichuk.lect_002.search;

import By_Melnichuk.lect_002.search.read.FileContentReader;
import By_Melnichuk.lect_002.search.read.ScannerContentReader;
import By_Melnichuk.lect_002.search.scanner.FileScanner;
import By_Melnichuk.lect_002.search.scanner.RecursiveFileScanner;
import By_Melnichuk.lect_002.search.search.ContentSearcher;
import By_Melnichuk.lect_002.search.search.PrimitiveContentSearcher;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SearchEngine {
    public void searchAndPrintResults(File input, String search) {
        Collection<File> result = this.search(input, search);
        if (result.isEmpty()){
            System.out.println("No files found");
        }else{
            System.out.println("Files found: " + result.size());
            for (File file : result) {
                try {
                    System.out.println(file.getCanonicalPath());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public Collection<File> search(File input, String search){
        List<File> result = new ArrayList<>();

        FileScanner fileScanner = new RecursiveFileScanner();
        FileContentReader fileContentReader = new ScannerContentReader();
        ContentSearcher contentSearcher = new PrimitiveContentSearcher();

        Collection<File> files = fileScanner.scan(input);
        for (File file : files) {
            String content = fileContentReader.read(file);
            if(contentSearcher.search(content, search)){
                result.add(file);
            }
        }
        return result;
    };
}
