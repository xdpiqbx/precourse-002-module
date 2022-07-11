package By_Melnichuk.lect_001;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Queue;

public class MyOwnInputStream extends InputStream {
    private Queue<Byte> byteQ;
    public MyOwnInputStream(String input){
        byte[] bytes = input.getBytes(StandardCharsets.UTF_8);
        byteQ = new ArrayDeque<>();
        for (byte aByte : bytes) {
            byteQ.add(aByte);
        }
    }

    @Override
    public int read() throws IOException {
        if(available() == 0){
            return -1;
        }
        return byteQ.poll() + 1;
    }

    @Override
    public int available() throws IOException {
        return byteQ.size();
    }
}
