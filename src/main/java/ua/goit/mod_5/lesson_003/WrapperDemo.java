package ua.goit.mod_5.lesson_003;

public class WrapperDemo {
    public static void main(String[] args) {
        integerDemo();
    }
    private static void integerDemo(){
        int primitive = 10;

        Integer integerWrapper = primitive; // Autoboxing
        int unboxedPrimitive = integerWrapper; // Unboxing

        Integer iNum_00 = Integer.valueOf(15);
        Integer iNum_01 = Integer.valueOf("10");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Compare: " + Integer.compare(iNum_00, iNum_01));

        System.out.println(Integer.parseInt("15"));
        System.out.println(iNum_00.intValue());

        unboxingMethod(iNum_00);
        unboxingMethod(iNum_00);

        Integer[] array = new Integer[5];
        // arrayUnboxing(array); // required type int[]
    }

    private static void unboxingMethod(int iNum){
        System.out.print("First " + iNum);
    }
    private static void unboxingMethod(Integer iNum){
        System.out.print("Second " + iNum);
    }

    private static void arrayUnboxing(int[] array){}
}
