package By_Melnichuk.lect_001.reader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTests {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("./src/main/out.txt");
        writer.write("Test output");
        writer.close();
    }
}
