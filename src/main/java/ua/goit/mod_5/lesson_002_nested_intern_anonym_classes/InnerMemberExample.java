package ua.goit.mod_5.lesson_002_nested_intern_anonym_classes;

public class InnerMemberExample {
    private int data = 40;
    class Inner{
        int data = 20;
        void msg(int data){
            System.out.println("data is: " + data);
            System.out.println("this.data is: " + this.data);
            System.out.println("InnerMemberExample.this.data is: " + InnerMemberExample.this.data);
        }
    }

    public static void main(String[] args) {
        InnerMemberExample outerClass = new InnerMemberExample();
        InnerMemberExample.Inner innerClass = outerClass.new Inner();
        innerClass.msg(10);
    }
}
