package ua.goit.LessonsByZaur;

public class Ex3_implementRunnable {
    public static void main(String[] args) {
        Thread loopAscLoop = new Thread(new LoopAscLoopImpl());
        Thread loopDescLoop = new Thread(new LoopDescLoopImpl());

        loopAscLoop.start();
        loopDescLoop.start();
    }
}

class LoopAscLoopImpl implements Runnable{
    // ascending - висхідний
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " i asc = " + i);
        }
    }
}

class LoopDescLoopImpl implements Runnable{
    // descending - спадання
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 10; i > 0; i--) {
            System.out.println(name + " i desc = " + i);
        }
    }
}