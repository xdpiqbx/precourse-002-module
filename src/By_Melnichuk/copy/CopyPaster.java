package By_Melnichuk.copy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyPaster {
    private final InputStream isFrom;
    private final OutputStream osTo;

    public CopyPaster(InputStream isFrom, OutputStream osTo) {
        this.isFrom = isFrom;
        this.osTo = osTo;
    }

    public void copy() throws IOException {
        while(isFrom.available() > 0){
            osTo.write(isFrom.read());
        }
        isFrom.close();
        osTo.close();
    }
}
