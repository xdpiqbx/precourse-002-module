package By_Melnichuk.lect_002;

import java.io.File;

public class FileConstructorTests {
    public static void main(String[] args) {
        String path = "./src/By_Melnichuk/lect_002/files/";
        File base = new File(path);
        File root = new File(base, "root.txt");
        System.out.println("root.exists() = " + root.exists());
    }
}
