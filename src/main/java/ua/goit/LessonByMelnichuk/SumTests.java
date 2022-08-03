package ua.goit.LessonByMelnichuk;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SumTests {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        long[][] startFinish = {
            {0L, 100000000L},
            {100000001L, 200000000L},
            {200000001L, 300000000L},
            {300000001L, 400000000L},
            {400000001L, 500000000L},
            {500000001L, 600000000L},
            {600000001L, 700000000L},
            {700000001L, 800000000L},
            {800000001L, 900000000L},
            {900000001L, 1000000000L}
        };

        List<BigDecimal> results = new CopyOnWriteArrayList<>();

        List<Thread> threads = new ArrayList<>();

        for (long[] pair : startFinish) {
            long start = pair[0];
            long end = pair[1];
            SumThread thread = new SumThread(
                BigDecimal.valueOf(start),
                BigDecimal.valueOf(end),
                results
            );
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        BigDecimal finalResult = BigDecimal.ZERO;
        for (BigDecimal subSum : results) {
            finalResult = finalResult.add(subSum);
        }

        long duration = System.currentTimeMillis() - startTime;

        System.out.println("duration = " + duration);
        System.out.println("finalResult = " + finalResult);

    }

    private static class SumThread extends Thread{
        private BigDecimal start;
        private BigDecimal end;
        private List<BigDecimal> result;
        public SumThread(BigDecimal start, BigDecimal end, List<BigDecimal>result){
            this.start = start;
            this.end = end;
            this.result = result;
        }
        @Override
        public void run() {
            long tmpSum = start.longValue();
            long startLong = start.longValue();
            long endLong = end.longValue();
            for (long i = startLong; i < endLong; i++) {
                tmpSum += i;
            }
            result.add(BigDecimal.valueOf(tmpSum));
        }
    }
}

//public class SumTests {
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        BigDecimal sum = BigDecimal.ZERO;
//        for (int i = 0; i < 1000000000; i++) {
//            sum = sum.add(BigDecimal.valueOf(i));
//        }
//        long duration = System.currentTimeMillis() - start;
//        System.out.println("duration = " + duration); // 5339 ms
//        System.out.println("sum = " + sum); // 499999999500000000
//                                               499999999500000009
//    }
//}
