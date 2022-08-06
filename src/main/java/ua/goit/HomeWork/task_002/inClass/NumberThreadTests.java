package ua.goit.HomeWork.task_002.inClass;

import java.util.ArrayList;
import java.util.List;

public class NumberThreadTests {
    public static void main(String[] args) {
        ProcessThread fizzBuzz = new ProcessThread(new NumberProcessor() {
            @Override
            public void process(int n) {
                if (n % 15 == 0) {
                    System.out.println("FizzBuzz");
                }
            }
        });

        ProcessThread fizz = new ProcessThread(new NumberProcessor() {
            @Override
            public void process(int n) {
                if (n % 3 == 0) {
                    System.out.println("Fizz");
                }
            }
        });

        ProcessThread buzz = new ProcessThread(new NumberProcessor() {
            @Override
            public void process(int n) {
                if (n % 5 == 0) {
                    System.out.println("Buzz");
                }
            }
        });

        ProcessThread number = new ProcessThread(new NumberProcessor() {
            @Override
            public void process(int n) {
                if (n % 3 != 0 && n % 5 != 0) {
                    System.out.println(n);
                }
            }
        });

        List<ProcessThread> threads = new ArrayList<>();

        threads.add(fizzBuzz);
        threads.add(fizz);
        threads.add(buzz);
        threads.add(number);

        for (ProcessThread thread : threads) {
            thread.start();
        }

        for(int i = 0; i <= 100; i++){
            for (ProcessThread thread : threads) {
                thread.process(i);
            }
            while(true){
                int processedCount = 0;
                for (ProcessThread thread : threads) {
                    if(thread.isProessed()){
                        processedCount++;
                    }
                }
                if(processedCount == threads.size()){
                    break;
                }
            }
        }
        for (ProcessThread thread : threads) {
            thread.interrupt();
        }
    }
}
