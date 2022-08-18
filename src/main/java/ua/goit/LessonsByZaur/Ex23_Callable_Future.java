package ua.goit.LessonsByZaur;

// Runnabl Factorial

// Callable можно использовать только с ExecutorService

import java.util.concurrent.*;

public class Ex23_Callable_Future {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//        executorService.execute(factorial);
        Future future = executorService.submit(factorial); // <=== Future example
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        try {
            System.out.println("future.get() " + future.get()); // <=== Future example
            System.out.println("future.isDone() " + future.isDone()); // <=== Future example
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println(factorialResult);
    }
}

class Factorial implements Runnable{
    int f;
    Factorial(int f){
        this.f = f;
    }
    @Override
    public void run() {
        if (f <= 0){
            System.out.println("Wrong data");
            return;
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        Ex23_Callable_Future.factorialResult = result;
    }
}