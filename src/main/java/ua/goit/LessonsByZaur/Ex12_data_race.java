package ua.goit.LessonsByZaur;

public class Ex12_data_race {
    public static void main(String[] args) {
        MyRunnableImpl myRunnable = new MyRunnableImpl();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
        // Data Race
        // 2 2 5 3 6 4 7 9 8
    }
}

class Counter{
    static int count = 0;
}

class MyRunnableImpl implements Runnable{
    public void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}
