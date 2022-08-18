package ua.goit.LessonsByZaur;

// Callable Factorial

// Callable можно использовать только с ExecutorService

import java.util.concurrent.*;

public class Ex24_Callable_Future_2 {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial_2 factorial = new CallableFactorial_2(6);
        Future<Integer> future = executorService.submit(factorial);

        try {
            System.out.println("Start: " + future.isDone());
            System.out.println("Wait for result...");
            factorialResult = future.get();
            System.out.println("Done.");
            System.out.println("Finish: " + future.isDone());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }finally {
            executorService.shutdown();
        }

        System.out.println(factorialResult);
    }
}

class CallableFactorial_2 implements Callable<Integer> {
    int f;

    public CallableFactorial_2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if(f <= 0){
            throw new Exception("Wrong data");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
            Thread.sleep(500L);
        }
        return result;
    }
}