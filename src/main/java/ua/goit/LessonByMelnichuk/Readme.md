# Module 12 - Multithreads

## Thread

`Thread.currentThread().` in threads - it's like `this.` in classes.

### Ways to create Threads

1. Create custom class and extend Thread

```java
public class CreateThreads {
    public static void main(String[] args) {
        new CustomThread().start();
    }

    private static class CustomThread extends Thread{
        @Override
        public void run() {
            System.out.println(
                "Thread.currentThread().getName() = "
                +Thread.currentThread().getName()
            );
        }
    }
}
```

2. Realize `@FunctionalInterface Runnable`

```java
public class CreateThread {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(
                    "Thread.currentThread().getName() = "
                    + Thread.currentThread().getName()
                );
            }
        }).start();
    }
}
```

3. Lambda

```java
public class CreateThread {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(
            "Thread.currentThread().getName() = "
            +Thread.currentThread().getName()
        )).start();
    }
}
```

### Thread Sleep

```java
public class ThreadSleepTests {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");

        new Thread(()->{
            System.out.println("In new Thread");
            try {
                Thread.sleep(2000); // <------------------###
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("End in new Thread");
        }).start();

        Thread.sleep(1000); // <--------------------------###

        System.out.println("End");
    }
}
```

### Synchronized
- allows to block access to a method or piece of code if another thread is already using it

```java
public class ThreadWaitTests {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (true){
                System.out.println("In new thread...");
                try {
                    // synchronized block
                    synchronized (Thread.currentThread()){ // <------###
                        Thread.currentThread().wait();
                    }
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread.start();
    }
}
```

```java
// synchronized method
    public synchronized static void increment(){
        counter = counter + 1;
    }
```

### Volatile

- volatile keyword guarantees visibility of changes to variable across threads

```java
public class PausableThread extends Thread {
    private volatile boolean running = true;
//.....
}
```

---

`Thread methods`
```java
//thread.run();
//thread.start();
//thread.join();
//thread.interrupt();
//thread.notify();
//thread.notifyAll();
//thread.wait();

//thread.getId();
//thread.getName();
//thread.getPriority();
//thread.getClass();
//thread.getState();
//thread.getThreadGroup();
//thread.getContextClassLoader();
//thread.getStackTrace();
//thread.getUncaughtExceptionHandler();

//thread.isAlive();
//thread.isDaemon();
//thread.isInterrupted();

//thread.setPriority();
//thread.setContextClassLoader();
//thread.setDaemon();
//thread.setName();
//thread.setUncaughtExceptionHandler();
```