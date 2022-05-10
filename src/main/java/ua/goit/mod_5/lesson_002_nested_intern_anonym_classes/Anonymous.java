package ua.goit.mod_5.lesson_002_nested_intern_anonym_classes;

public class Anonymous {
    public static void main(String[] args) {

        System.out.println(
            Thread.currentThread().getName()
        );

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            }
        }).start();

    }
}
