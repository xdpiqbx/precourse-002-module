package ua.goit.LessonByMelnichuk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListTests {
    private static synchronized void add(List<String> items, String item){
        items.add(item);
    }

    public static void main(String[] args) throws InterruptedException {

//        List<String> items = new ArrayList<>(); // NOT thread save!
        List<String> items = new CopyOnWriteArrayList<>(); // Thread save =) (slow)
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
//                    add(items, "A");
                    items.add("A");
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

        System.out.println(items.size());
    }
}
