package By_Melnichuk.lect_001;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ByteArrayInputStreamTest {
    public static void main(String[] args) {
        byte[] bytes = {65, 66, 67, -90};

        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        while(bais.available() > 0){
            System.out.println("bais.read() = " + bais.read());
        }

        Scanner scanner = new Scanner(bais);
        System.out.println("scanner.nextLine() = " + scanner.nextLine());
    }
}
