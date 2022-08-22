package ua.goit.HomeWork.task_001;

public class main {
    private static volatile boolean isSecondLeft = false;
    public static void main(String[] args) {

        long programStartAt = System.currentTimeMillis();

        new Thread(()->{
            while(true){
                System.out.println("program was started " + (System.currentTimeMillis() - programStartAt) + " millis ago");
                try {
                    Thread.sleep(1000L);
                    isSecondLeft = true;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                try {
                    for (int i = 0; i < 5; i++){
                        Thread.sleep(1000L);
                        if(isSecondLeft){
                            isSecondLeft = false;
                        }
                    }
                    System.out.println("Прошло 5 секунд");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
