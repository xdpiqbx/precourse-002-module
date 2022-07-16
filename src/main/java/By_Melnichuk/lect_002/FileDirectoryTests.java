package By_Melnichuk.lect_002;

import java.io.File;

public class FileDirectoryTests {
    public static void main(String[] args) {
        String path = "./src/By_Melnichuk/lect_002/files/dir/subdir";
        File file = new File(path);
        System.out.println("file.exists() = " + file.exists()); // false

        // make 1 dir
        System.out.println("file.mkdir() = " + file.mkdir()); // boolean result
        System.out.println("file.exists() = " + file.exists());

        // make folder and subfolders
        System.out.println("file.mkdirs() = " + file.mkdirs()); // boolean result
        System.out.println("file.exists() = " + file.exists()); // true
    }
}
