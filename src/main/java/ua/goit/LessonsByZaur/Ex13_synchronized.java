package ua.goit.LessonsByZaur;

public class Ex13_synchronized {
    static int counter = 0;
    public static synchronized void increment(){
        counter++;
    }
    // synchronized - разрешает только одному потоку работать с методом

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableEx13());
        Thread thread2 = new Thread(new RunnableEx13());

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }
}

class RunnableEx13 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex13_synchronized.increment();
        }
    }
}
