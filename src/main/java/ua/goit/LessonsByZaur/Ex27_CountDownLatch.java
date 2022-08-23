package ua.goit.LessonsByZaur;

import java.util.concurrent.CountDownLatch;

public class Ex27_CountDownLatch {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffIsOnPlace(){
        try {
            Thread.sleep(2000L);
            System.out.println("Market staff came to work");
            countDownLatch.countDown();
            System.out.println("countDownLatch.getCount() = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void everythingReady(){
        try {
            Thread.sleep(3000L);
            System.out.println("Everything ready, so let's open Market");
            countDownLatch.countDown();
            System.out.println("countDownLatch.getCount() = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private static void openMarket(){
        try {
            Thread.sleep(4000L);
            System.out.println("Market is open");
            countDownLatch.countDown();
            System.out.println("countDownLatch.getCount() = " + countDownLatch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Lena", countDownLatch);
        new Friend("Vik", countDownLatch);
        new Friend("Marina", countDownLatch);

        marketStaffIsOnPlace();
        everythingReady();
        openMarket();
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public Friend (String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " starts shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
