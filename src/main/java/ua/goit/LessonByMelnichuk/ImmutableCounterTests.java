package ua.goit.LessonByMelnichuk;

import java.util.ArrayList;
import java.util.List;

public class ImmutableCounterTests {
    private static volatile ImmutableCounter counter = new ImmutableCounter(0);

    public static synchronized void increment(){
        counter = counter.increment();
    }

    public static void main(String[] args) throws InterruptedException {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    increment();
                }
            });
            threads.add(thread);
        }

        for (Thread thread: threads){
            thread.start();
        }

        for (Thread thread: threads){
            thread.join(); // Waits for this thread to die - Ждёт завершения потока
        }

        System.out.println("counter = " + counter);
    }
}
