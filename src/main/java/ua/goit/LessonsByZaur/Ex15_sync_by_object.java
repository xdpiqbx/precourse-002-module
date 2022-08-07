package ua.goit.LessonsByZaur;

// Нельзя синхронизировать конструкторы

public class Ex15_sync_by_object {
//    static final Smartphone smartphone = new Smartphone(); // не надо делать пустых класов

    static final Object lock = new Object();

    public static void main(String[] args) {
        Thread mobileThread = new Thread(new MobileImplRunnable());
        Thread skypeThread = new Thread(new SkypeImplRunnable());
        Thread whatsappThread = new Thread(new WhatsappImplRunnable());

        mobileThread.start();
        skypeThread.start();
        whatsappThread.start();
    }
    synchronized void mobileCall(){
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ENDS");
        }
    }
    synchronized void skypeCall(){
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ENDS");
        }
    }
    synchronized void whatsappCall(){
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(7000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Whatsapp call ENDS");
        }
    }
}

//class Smartphone{} // лучше использовать Object

class MobileImplRunnable implements Runnable{
    @Override
    public void run() {
        new Ex15_sync_by_object().mobileCall();
    }
}

class SkypeImplRunnable implements Runnable{
    @Override
    public void run() {
        new Ex15_sync_by_object().skypeCall();
    }
}

class WhatsappImplRunnable implements Runnable{
    @Override
    public void run() {
        new Ex15_sync_by_object().whatsappCall();
    }
}
