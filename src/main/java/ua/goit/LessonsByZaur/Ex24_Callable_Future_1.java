package ua.goit.LessonsByZaur;

// Callable Factorial

// Callable можно использовать только с ExecutorService

import java.util.concurrent.*;

public class Ex24_Callable_Future_1 {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        CallableFactorial factorial = new CallableFactorial(6);
        Future<Integer> future = executorService.submit(factorial);

        try {
            factorialResult = future.get();
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

class CallableFactorial implements Callable<Integer> {
    int f;

    public CallableFactorial(int f) {
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
        }
        return result;
    }
}