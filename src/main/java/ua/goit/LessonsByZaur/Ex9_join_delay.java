package ua.goit.LessonsByZaur;

public class Ex9_join_delay {
    public static void main(String[] args) {
        System.out.println("Main start");
        Thread thread = new Thread(new Worker());
        thread.start();
        try {
            thread.join(1500); // так main не ждёт выполнения Worker, а просто ждёт 1500 мс или завершения Worker
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main end");
    }
}

class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work start");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work end");
    }
}