package ua.goit.mod_009.HW3;

import java.util.Scanner;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        scanner.close();
    }

    public void testMath(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(num1+num2+" "+(num1-num2)+" "+(num1*num2)+" "+(num1 / num2));
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
//        computerTests.testBasicInputOutput();
        new MoonComputerTests().testMath();
    }
}