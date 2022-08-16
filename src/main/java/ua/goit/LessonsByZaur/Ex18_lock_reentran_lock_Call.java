package ua.goit.LessonsByZaur;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex18_lock_reentran_lock_Call {
    public static void main(String[] args) {

        Call call = new Call();

        Thread mobileCall = new Thread(new Runnable() {
            @Override
            public void run() {
                call.mobileCall();
            }
        });
        Thread skypeCall = new Thread(new Runnable() {
            @Override
            public void run() {
                call.skypeCall();
            }
        });
        Thread whatsAppCall = new Thread(new Runnable() {
            @Override
            public void run() {
                call.whatsAppCall();
            }
        });

        mobileCall.start();
        skypeCall.start();
        whatsAppCall.start();
    }
}

class Call{
    private final Lock lock = new ReentrantLock();
    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000L);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(4000L);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatsAppCall(){
        lock.lock();
        try {
            System.out.println("WhatsApp call starts");
            Thread.sleep(5000L);
            System.out.println("WhatsApp call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
