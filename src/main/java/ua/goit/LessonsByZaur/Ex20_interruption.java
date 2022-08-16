package ua.goit.LessonsByZaur;

public class Ex20_interruption {
    public static void main(String[] args) {
        System.out.println("Main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        try {
            Thread.sleep(1000L);
            thread.interrupt();
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread{
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Interupted");
                System.out.println("sqrtSum = " + sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100L);
            } catch (InterruptedException e) {
                System.out.println("Interrupted while sleeping");
                System.out.println("sqrtSum = " + sqrtSum);
                return;
            }
        }
    }
}