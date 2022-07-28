package ua.goit.LessonByMelnichuk;

public class PausableThread extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while(true){
            if (running){
                System.out.println("In PausableThread");
            }
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public static void main(String[] args) {
        PausableThread thread = new PausableThread();
        thread.start();
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread.setRunning(false);
    }
}
