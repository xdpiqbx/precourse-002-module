package ua.goit.LessonsByZaur;

public class Ex8_thread_sleep_join extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        Thread thread1 = new Thread(new RunnableSleep());
        Ex8_thread_sleep_join thread2 = new Ex8_thread_sleep_join();

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // main будет ждать окончания работы потока thread1
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End");
    }
}

class RunnableSleep implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}