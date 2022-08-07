package ua.goit.LessonsByZaur;

public class Ex9_thread_states {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadStateTest());
        System.out.println("state before start: " + thread.getState()); // NEW
        thread.start();
        System.out.println("state after start: " + thread.getState()); // RUNNABLE
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("state after join: " + thread.getState()); // TERMINATED
    }
}

class ThreadStateTest implements Runnable{
    @Override
    public void run() {
        System.out.println("ThreadState start");
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ThreadState END");
    }
}