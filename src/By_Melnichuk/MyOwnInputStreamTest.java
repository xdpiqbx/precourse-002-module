package By_Melnichuk;

import java.util.Scanner;

public class MyOwnInputStreamTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new MyOwnInputStream("Hello"));
        System.out.println("scanner.nextLine() = " + scanner.nextLine());
    }
}
