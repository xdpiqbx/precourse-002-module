package ua.goit.LessonsByZaur;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ex25_Callable_Future {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResults = new ArrayList<>();
        long valueDividedBy10 = SumNumbers.value / 10;
        for (int i = 0; i < 10; i++){
            long from = valueDividedBy10 * i + 1;
            long to = valueDividedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> futurePartSum = executorService.submit(task);
            futureResults.add(futurePartSum);
        }
        for (Future <Long> result: futureResults) {
            try {
                SumNumbers.sum += result.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }
        executorService.shutdown();
        System.out.println("Total sum: " + SumNumbers.sum);
    }
}

class SumNumbers{
    public static long value = 1_000_000_000L;
    public static long sum = 0;
}

class PartialSum implements Callable<Long>{
    long from;
    long to;
    long localSum;

    public PartialSum(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }
        System.out.printf("Sum from: %d to: %d = %d\n", from, to, localSum);
        return localSum;
    }
}