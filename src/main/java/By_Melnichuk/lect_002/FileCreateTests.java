package By_Melnichuk.lect_002;

import java.io.File;
import java.io.IOException;

public class FileCreateTests {
    public static void main(String[] args) throws IOException {
        String path = "./src/By_Melnichuk/lect_002/files";
        File file = new File(path + "/new-file.txt");

        // Create empty file
        file.createNewFile();

        // true
        System.out.println("file.exists() = " + file.exists());
    }
}
