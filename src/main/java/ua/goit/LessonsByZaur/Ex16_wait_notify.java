package ua.goit.LessonsByZaur;

// wait
// notify
// notifyAll

public class Ex16_wait_notify {
    public static void main(String[] args) {
        Market market = new Market();

        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadProducer.start();
        threadConsumer.start();
    }
}

class Market{
    private int breadCount = 0;
    public synchronized void getBread(){ // тут synchronized по this
        // если бы делали synchronized по lock
        // synchronized(lock){ ... lock.wait() ... lock.notify ... }
        while(breadCount < 1){ // while а не if - рекомендация.
            try {
                wait(); // this.wait()
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Потребитель купил 1 буханочку");
        System.out.println("Осталось хлеба: " + breadCount);
        notify(); // this.notify()
    }
    public synchronized void putBread(){
        while(breadCount >= 5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Добавил 1 буханочку");
        System.out.println("Осталось хлеба: " + breadCount);
        notify();
    }
}

class Producer implements Runnable{
    Market market;
    Producer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
class Consumer implements Runnable{
    Market market;
    Consumer(Market market){
        this.market = market;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}