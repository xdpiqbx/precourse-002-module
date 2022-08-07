package ua.goit.LessonsByZaur;

public class Ex14_sync_block_2 {
    volatile static int counter = 0;
    public static void increment(){
        synchronized(Ex14_sync_block_2.class){
            counter++;
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new LoopIncrement());
        Thread thread2 = new Thread(new LoopIncrement());

        thread1.start();
        thread2.start();
    }
}
class LoopIncrement implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex14_sync_block_2.increment();
        }
    }
}
