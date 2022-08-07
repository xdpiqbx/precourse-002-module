package ua.goit.LessonsByZaur;

public class Ex2_extendThread {
    public static void main(String[] args) {
        LoopAscLoop loopAscLoop1 = new LoopAscLoop();
        LoopAscLoop loopAscLoop2 = new LoopAscLoop();
        LoopDescLoop loopDescLoop = new LoopDescLoop();

        loopAscLoop1.start();
        loopAscLoop2.start();
//        loopAscLoop2.start(); // Так нельзя! - IllegalThreadStateException
        loopDescLoop.start();
    }
}

class LoopAscLoop extends Thread{
    // ascending - висхідний
    String main = Thread.currentThread().getName();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.println(main + " " + name + " i asc = " + i);
        }
    }
}

class LoopDescLoop extends Thread{
    // descending - спадання
    String main = Thread.currentThread().getName();
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 10; i > 0; i--) {
            System.out.println(main + " " + name + " i desc = " + i);
        }
    }
}
