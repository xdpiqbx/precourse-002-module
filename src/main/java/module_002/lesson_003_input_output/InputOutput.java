package main.java.module_002.lesson_003_input_output;

import java.util.Date;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.print("[print] Hello world \r\n");
        System.out.println("[println] Hello world");
        int iNum = 10;
        String sText = "Java";
        System.out.printf("[printf] Hello world %d %s %n", iNum, sText);
        System.out.printf("'%.2f'%n", 5.1473); // 5.15
        /*
            %n - Line Separator
            %d - Integer Formatting (digit)
            %f - Float and Double Formatting
            %x - hexadecimal
            %c - Char Formatting
            %s - String Formatting
            %b - Boolean Formatting
            %tT - Date and Time Formatting 07:15:35
        */
        Date date = new Date();
        // to get rid of multiple arguments, we can use the index reference of our input parameter, which is 1$ in our case
        System.out.printf("%1$tH:%1$tM:%1$tS %1$tp %1$tL %1$tN %1$tz %n", date); // 05:45:30 am 331 331000000 +0300
        System.out.printf("%1$tA, %1$td %1$tB %1$tY %n", date); // суббота, 07 мая 2022
        System.out.printf("%1$td.%1$tm.%1$ty %n", date); // 07.05.22

        System.out.println("===== Scanner =====");

        // Scanner
        Scanner scan = new Scanner(System.in);
        /*
            scan.next(); // read string to first space
            scan.nextLine(); // read full string
            scan.nextInt(); // read integer
            scan.next[some other primitive type](); // read integer
        */
        System.out.println("Enter Your name: ");
        String name = scan.nextLine();
        System.out.println(name + " enter your age:");
        int age = scan.nextInt();
        System.out.println(name + " enter your height in meters:");
        float height = scan.nextFloat();

        System.out.printf("Hello %s, your age is: %d, your height is %.2f", name, age, height);
        System.out.printf("%nHello "+name+", your age is: %d, your height is %.2f", age, height);

        scan.close(); // to close stream
    }
}
