package ua.goit.LessonByMelnichuk;

public class ThreadSleepTests {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        new Thread(()->{
            System.out.println("In new Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End in new Thread");
        }).start();

        Thread.sleep(1000);

        System.out.println("End");
    }
}
