package ua.goit.LessonsByZaur;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Hi");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Bye=)");

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }
}

// В одноядерных процессорах Context Switch
