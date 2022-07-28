package ua.goit.LessonByMelnichuk;

public class ThreadWaitTests {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (true){
                System.out.println("In new thread...");
                try {
                    synchronized (Thread.currentThread()){
                        Thread.currentThread().wait();
                    }
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start(); // Thread starts here
    }
}
