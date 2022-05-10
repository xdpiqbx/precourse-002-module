package ua.goit.mod_5.lesson_002_nested_intern_anonym_classes;

public class LocalInnerExample {
    private int data = 10;
    void display(){
        final int methodVariable = 10;
        class LocalInner{
            void msg(){
                System.out.println(methodVariable); // methodVariable must be final
                System.out.println("msg " + data);
            }
        }

        LocalInner local = new LocalInner();
        local.msg();
    }

    public static void main(String[] args) {
        LocalInnerExample outerClass = new LocalInnerExample();
        outerClass.display();
    }
}
