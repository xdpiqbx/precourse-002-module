package main.java.module_002.lesson_002_basic_logic_and_arithmetic_operations;

public class BasicLogicAndArithmeticOperations {
    public static void main(String[] args) {
        {
            // declaration
            int a;
            // assignement
            a = 42;
            // initialization
            int iNum = 100500;

            System.out.println("a: " + a);
            System.out.println("iNum: " + iNum);
        };

        {
            double a1 = 3 / 2; // 1.0
            double a2 = 3 / 2.0; // 1.5
            System.out.println("a1 = " + a1 + "\na2 = " + a2);
        };

        {
            // Increment
            int a = 5;
            int b = 5;
            System.out.println("++a = " + ++a); // 6
            System.out.println("b++ = " + b++); // 5

            // Decrement
            int c = 5;
            int d = 5;
            System.out.println("--c = " + --c); // 4
            System.out.println("d-- = " + d--); // 5
        };

        boolean res3 = getTrue() || getFalse();
        boolean res4 = getTrue() && getFalse();

        boolean res1 = getTrue() | getFalse();
        boolean res2 = getTrue() & getFalse();
    }
    public static boolean getTrue() {
        System.out.println("getTrue()");
        return true;
    }
    public static boolean getFalse() {
        System.out.println("getFalse()");
        return false;
    }
}
