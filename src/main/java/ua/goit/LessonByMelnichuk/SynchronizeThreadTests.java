package ua.goit.LessonByMelnichuk;

import java.util.ArrayList;
import java.util.List;

// Потоки НЕ синхронизированы и пытаются изменить одну и ту же переменную counter!
public class SynchronizeThreadTests {

    private volatile static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter = counter+1;
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

// https://youtu.be/LeRfh6r8M2g?t=5213