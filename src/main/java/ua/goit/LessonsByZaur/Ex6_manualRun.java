package ua.goit.LessonsByZaur;

public class Ex6_manualRun implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run Ex6: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Method main: " + Thread.currentThread().getName());

        Thread thread = new Thread(new Ex6_manualRun());
        thread.start(); // Method run Ex6: Thread-0
//        thread.run(); // Method run Ex6: main - DO NOT DO THIS !!! always use START
    }
}
