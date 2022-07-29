package ua.goit.LessonByMelnichuk;

import java.util.Scanner;

public class PausableThread extends Thread{
    private volatile boolean running = false;
    private volatile boolean isAlive = true;
    @Override
    public void run() {
        while(isAlive){
            if (running){
                System.out.println("Running");
            }
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void kill() {
        isAlive = false;
    }

    public static void main(String[] args) {
        PausableThread thread = new PausableThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);

        while(true){
            String command = scanner.nextLine();
            switch (command){
                case "exit":
                    System.out.println("Exit!");
                    System.exit(0);
                    break;
                case "start":
                    System.out.println("Start thread!");
                    thread.setRunning(true);
                    break;
                case "stop":
                    System.out.println("Stop thread!");
                    thread.setRunning(false);
                    break;
                case "terminate":
                    System.out.println("Thread! terminated");
                    thread.stop();
                    break;
                case "kill":
                    System.out.println("Killed!");
                    thread.kill();
                    break;
            }
        }
    }
}
