package ua.goit.LessonsByZaur;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex22_Scheduled_exec_service {
    public static void main(String[] args) {
        ScheduledExecutorService schExecService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            schExecService.execute(new RunnableImpl200());
//        }

        // через 3 секунды будет запущена задача
        // schExecService.schedule(new RunnableImpl200(), 3, TimeUnit.SECONDS); // <=======

        // периодическое выполнение задач
        // через 3 секунды начнётся выполнение RunnableImpl200
        // и задания будут стартовать каждую секунду
        // (  task )--(task)-----(     task    )( task )(    task    )
        // |--second--|--second--|--second--|--second--|--second--|
        // schExecService.scheduleAtFixedRate(new RunnableImpl200(), 2, 1, TimeUnit.SECONDS); // <=======

        // фиксированная задержка между задачами
        //(task)--second--(task)--second--(task)--second--(task)
        // schExecService.scheduleWithFixedDelay(new RunnableImpl200(), 2, 1, TimeUnit.SECONDS); // <=======

        // newCachedThreadPool() будет создавать кешированные потоки по надобности
        ExecutorService schExecServiceCach = Executors.newCachedThreadPool();

        try {
            Thread.sleep(20000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        schExecService.shutdown();
    }
}

class RunnableImpl200 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Begin work");
        try {
            Thread.sleep(500L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " End work");
    }
}