package ua.goit.LessonByMelnichuk;

public class PausableThread extends Thread{
    private boolean running = true;
    @Override
    public void run() {
        while(true){
            System.out.println("In PausableThread");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void pause(){
        synchronized (this){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        PausableThread thread = new PausableThread();
        thread.start();
    }
}
