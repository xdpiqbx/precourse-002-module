package ua.goit.LessonsByZaur;

public class Ex5_methodThread {
    public static void main(String[] args) {
        System.out.println("Ex5_methodThread video 67");

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        TestThreadMethods thread = new TestThreadMethods();
        System.out.println("thread.getName() = " + thread.getName()); // thread.setName("new name")
        System.out.println("thread.getPriority() = " + thread.getPriority()); // setPriority
    }
}
class TestThreadMethods extends Thread{
    @Override
    public void run() {
        System.out.println("Hi!");
    }
}
