package ua.goit.mod_4.lesson_005_packages_classes_signatures;

public abstract class AbstractClass { // cannot be used to create objects !!!
    public abstract void name(); // it does not have a body !!!

    public static void textOutput(){
        System.out.println("Some text");
    }

    private int generateNumber(int iNum){
        return iNum + 4;
    }
}
