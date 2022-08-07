package ua.goit.LessonsByZaur;

public class Ex11_volatile_bool extends Thread{
    volatile boolean b = true; // volatile - variable in main memory
    // volatile нормально работает если один поток меняет а другие только читают

    @Override
    public void run() {
        long counter = 0;
        while(b){
            counter++;
        }
        System.out.println("Loop is finished. counter = " + counter);
    }

    public static void main(String[] args) {
        Ex11_volatile_bool thread = new Ex11_volatile_bool();
        thread.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("After 3 seconds");
        thread.b = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Program end");
    }
}
