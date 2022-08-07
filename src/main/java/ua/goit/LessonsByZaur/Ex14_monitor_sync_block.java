package ua.goit.LessonsByZaur;

// synchronized
// синхронизация идёт по монитору,
// а монитор неотемлимая часть объекта и неотемлимая часть класа

public class Ex14_monitor_sync_block {
    public static void main(String[] args) {
        MyRunnableImplEx14 myRunnable = new MyRunnableImplEx14();
        Thread thread1 = new Thread(myRunnable);
        Thread thread2 = new Thread(myRunnable);
        Thread thread3 = new Thread(myRunnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class CounterEx14{
    static int count = 0;
}

class MyRunnableImplEx14 implements Runnable{
    private void doWork1(){
        doWork2();
        synchronized(this){
            CounterEx14.count++;
            System.out.println(CounterEx14.count);
        }
    }

    private void doWork2(){
        System.out.println("Hello!");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}