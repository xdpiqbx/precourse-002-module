package By_Melnichuk.lect_001.copy;

import java.io.*;

public class FileCopier {
    private final File from;
    private final File to;

    public FileCopier(String from, String to){
        this(new File(from), new File(to));
    }

    public FileCopier(File from, File to) {
        this.from = from;
        this.to = to;
    }

    public void copy() throws IOException {
        new CopyPaster(
                new FileInputStream(from),
                new FileOutputStream(to)
        ).copy();
    }
}
