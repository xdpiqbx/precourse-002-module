package ua.goit.LessonsByZaur;

import java.util.concurrent.Semaphore;

public class Ex26_Semaphore {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Igor", callBox);
        new Person("Bill", callBox);
        new Person("Ann", callBox);
        new Person("John", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " wait ...");
            callBox.acquire();
            System.out.println(name + " use phone");
            sleep(2000L);
            System.out.println(name + " finished call");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            callBox.release();
        }
    }
}