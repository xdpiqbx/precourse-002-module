package ua.goit.LessonByMelnichuk;

public class ThreadStart {
    public static void main(String[] args) {
        System.out.println("Thread.currentThread().getId() = " + Thread.currentThread().getId());
        System.out.println("...getName() = " + Thread.currentThread().getName());

        System.out.println("Runtime.getRuntime().availableProcessors() = " + Runtime.getRuntime().availableProcessors());
        System.out.println("...totalMemory() = " + Runtime.getRuntime().totalMemory());
    }
}
