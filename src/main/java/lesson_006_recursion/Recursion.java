package main.java.lesson_006_recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
    public static int factorial (int iNumber){
        if (iNumber == 0 || iNumber == 1){
            return 1;
        }
        int iResult = iNumber * factorial(iNumber - 1);
        return iResult;
    }
}
