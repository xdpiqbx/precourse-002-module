package ua.goit.mod_5.lesson_002_nested_intern_anonym_classes;

public class NestedOuter {
    // has access only to statics

    static int outerVariable = 10;
    private static int staticOuperVariable = 20;
    private int nonStaticVariable = 10;

    static class NestedInnerClass{
        void display(){
            System.out.println("outerVariable: " + outerVariable );
            System.out.println("staticOuperVariable: " + staticOuperVariable );
            // System.out.println("nonStaticVariable: " + nonStaticVariable );
        }
    }
}

class NestedTest{
    public static void main(String[] args) {
        NestedOuter.NestedInnerClass nestedClassInstance = new NestedOuter.NestedInnerClass();
        nestedClassInstance.display();
    }
}