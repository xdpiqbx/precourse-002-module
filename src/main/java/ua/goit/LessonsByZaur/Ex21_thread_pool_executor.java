package ua.goit.LessonsByZaur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
// import java.util.concurrent.ThreadPoolExecutor;

public class Ex21_thread_pool_executor {
    public static void main(String[] args) {
        // так на прямую ThreadPool не создают
        // ExecutorService executorService = new ThreadPoolExecutor();

        // ThreadPool удобнее всего создавать используя factory методы класса Executors
        // ExecutorService executorService = Executors.newSingleThreadExecutor();
        // ExecutorService executorService = Executors.newFixedThreadPool();
        // ExecutorService executorService = Executors.newCachedThreadPool();
        // ExecutorService executorService = Executors.newWorkStealingPool();

        // newFixedThreadPool
        // Сам поделит работу на указанное число потоков
        // ExecutorService executorService = Executors.newFixedThreadPool(5);

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImpl100());
        }

        executorService.shutdown();

        try {
            // awaitTermination отработает как join
            // либо executorService проделает всю работу
            // либьо пройдёт время в awaitTermination
            executorService.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main ends");
    }
}

class RunnableImpl100 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Begin work");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " End work");
    }
}