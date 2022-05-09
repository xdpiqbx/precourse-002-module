package ua.goit.mod_4.lesson_005_packages_classes_signatures;

public final class FinalClass {

    public static final int iZero = 0;

    public final void name(){
        System.out.println("Tom");
    }

    public static void textOutput(){
        System.out.println("Some text");
    }

    private int generateNumber(int iNum){
        return iNum + 4;
    }
}
