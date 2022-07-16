package By_Melnichuk.lect_002.search.read;

import java.io.File;
import java.util.Scanner;
import java.util.StringJoiner;

public class ScannerContentReader implements FileContentReader {
    @Override
    public String read(File file) {
        StringJoiner result = new StringJoiner("\n");
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                result.add(scanner.nextLine());
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result.toString();
    }
}
