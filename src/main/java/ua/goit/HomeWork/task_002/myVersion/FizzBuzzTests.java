package ua.goit.HomeWork.task_002.myVersion;

import java.util.function.IntConsumer;

public class FizzBuzzTests {

    public static void main(String[] args) {

        FizzBuzz fizzBuzz = new FizzBuzz(15);

        Runnable fizz = () -> System.out.print("fizz, ");
        Runnable buzz = () -> System.out.print("buzz, ");
        Runnable fizzbuzz = () -> System.out.print("fizzbuzz, ");
        IntConsumer number = (n) -> System.out.print(n + ", ");

        Thread threadA = new Thread(() -> {
            try {
                fizzBuzz.fizz(fizz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadB = new Thread(() -> {
            try {
                fizzBuzz.buzz(buzz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadC = new Thread(() -> {
            try {
                fizzBuzz.fizzbuzz(fizzbuzz);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadD = new Thread(() -> {
            try {
                fizzBuzz.number(number);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadA.start();
        threadB.start();
        threadC.start();
        threadD.start();
    }
}
