package ua.goit.LessonsByZaur;

// deadlock - когда два потока залочены навсегда
// livelock - когда два потока залочены навсегда, выполняют роботу но без прогреса
// lock starvation - когда мение приоритетные потоки ждут долгое время или постоянно

public class Ex17_deadlock {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 10: Попытка захватить монитор объекта lock 1");
        synchronized (Ex17_deadlock.lock1){
            System.out.println("Thread 10: Монитор объекта lock 1 захвачен");

            System.out.println("Thread 10: Попытка захватить монитор объекта lock 2");
            synchronized (Ex17_deadlock.lock2){
                System.out.println("Thread 10: Мониторы объектов lock 1 и lock 2 захвачены");
            }
        }
    }
}

class Thread20 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread 20: Попытка захватить монитор объекта lock 2");
        synchronized (Ex17_deadlock.lock2){
            System.out.println("Thread 20: Монитор объекта lock 2 захвачен");

            System.out.println("Thread 20: Попытка захватить монитор объекта lock 1");
            synchronized (Ex17_deadlock.lock1){
                System.out.println("Thread 20: Мониторы объектов lock 1 и lock 2 захвачены");
            }
        }
    }
}

// 17^43