package ua.goit.LessonsByZaur;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex18_lock_reentran_lock_ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Bill", lock);
        new Employee("John", lock);
        new Employee("Stan", lock);
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Employee("Lill", lock);
        new Employee("Will", lock);
    }
}

class Employee extends Thread{
    public String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " is waiting ...");
//            lock.lock();
                System.out.println(name + " use ATM ...");
                Thread.sleep(2000);
                System.out.println(name + " all done!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }else{
            System.out.println(name + " do not want to wait ...");
        }
    }

//    @Override
//    public void run() {
//        try {
//            System.out.println(name + " is waiting ...");
//            lock.lock();
//            System.out.println(name + " use ATM ...");
//            Thread.sleep(2000);
//            System.out.println(name + " all done!");
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } finally {
//            lock.unlock();
//        }
//    }
}
