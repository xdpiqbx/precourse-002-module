package By_Melnichuk.lect_002;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileTests {
    public static void main(String[] args) throws IOException {
        String path = "./src/By_Melnichuk/lect_002/files";
        File file = new File(path + "/root.txt");
        File dir = new File(path);
        File emptyFolder = new File(path+"/emptyFolder");

        System.out.println(new Scanner(file).nextLine());

        // Check if file exists
        System.out.println("file.exists() = " + file.exists());

        // Get file paths
        System.out.println("file.getCanonicalFile() = " + file.getCanonicalFile());
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());
        System.out.println("file.getPath() = " + file.getPath());

        // Is folder
        System.out.println("file.isDirectory() = " + file.isDirectory());

        // Is folder
        System.out.println("file.isFile() = " + file.isFile());

        // Returns: true if this abstract pathname is absolute, false otherwise
        System.out.println("file.isAbsolute() = " + file.isAbsolute());

        // Is hidden file
        System.out.println("file.isHidden() = " + file.isHidden());

        // Get list of files
        if(dir.isDirectory()){
            File [] files = dir.listFiles();
            for (File child : files) {
                System.out.println("child.getCanonicalFile() = " + child.getCanonicalFile());
            }
        }

        // emptyFolder - return NOTHING !!!
        if(emptyFolder.isDirectory()){
            File [] files = emptyFolder.listFiles();
            for (File child : files) {
                System.out.println("child.getCanonicalFile() = " + child.getCanonicalFile());
            }
        }

        // get path to parent directory
        System.out.println("file.getParentFile() = " + file.getParentFile());
    }
}
