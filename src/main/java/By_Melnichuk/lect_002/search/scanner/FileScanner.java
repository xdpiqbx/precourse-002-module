package By_Melnichuk.lect_002.search.scanner;

import java.io.File;
import java.util.Collection;

public interface FileScanner {
    Collection<File> scan(File base);
}
