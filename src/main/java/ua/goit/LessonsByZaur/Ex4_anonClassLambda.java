package ua.goit.LessonsByZaur;

public class Ex4_anonClassLambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + " anonymous Class");
            }
        }).start();

        new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name + " Lambda");
        }).start();
    }
}
