package ua.goit.LessonsByZaur;

public class Ex11_volatile_int extends Thread {
    static volatile int num = 0;
    // тут нормально работать не будет
    // два потока одновременно пытаются изменить

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            num += i;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Ex11_volatile_int thread = new Ex11_volatile_int();
        thread.start();
        for (int i = 0; i < 10000; i++) {
            num += i;
        }
        System.out.println(num);
    }
}

//51944246
//91594820