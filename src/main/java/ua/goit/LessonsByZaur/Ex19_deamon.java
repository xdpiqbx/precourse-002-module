package ua.goit.LessonsByZaur;

public class Ex19_deamon {
    public static void main(String[] args) {
        System.out.println("Main thread start");

        UserThread userThread = new UserThread();
        userThread.setName("User");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setName("Deamon");
        deamonThread.setDaemon(true);

        userThread.start();
        deamonThread.start();

        System.out.println("Main thread end");
    }
}

class UserThread extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is deamon: " + isDaemon());
        for (char i = 'A'; i < 'Z'; i++) {
            try {
                sleep(300L);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DeamonThread extends Thread{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is deamon: " + isDaemon());
        for (int i = 1; i < 1000; i++) {
            try {
                sleep(100L);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}