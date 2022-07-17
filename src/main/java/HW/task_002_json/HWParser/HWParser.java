package HW.task_002_json.HWParser;

import java.io.IOException;
import java.io.InputStream;

public interface HWParser {
    public String [] parse(InputStream fileInputStream) throws IOException;
}
