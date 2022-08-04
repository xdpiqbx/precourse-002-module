package ua.goit.HomeWork.task_001;

/*
Задание 1

Напишите программу, которая каждую секунду отображает на экране данные о времени,
прошедшем от начала сессии (запуска программы).

Другой ее поток выводит каждые 5 секунд сообщение `Прошло 5 секунд`.
Предусмотрите возможность ежесекундного оповещения потока,
воспроизводящего сообщение, потоком, отсчитывающим время.
*/

public class main {
    public static void main(String[] args) {

        long programStartAt = System.currentTimeMillis();

        new Thread(()->{
            while(true){
                System.out.println("program was started " + (System.currentTimeMillis() - programStartAt) + " millis ago");
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                try {
                    Thread.sleep(5000L);
                    System.out.println("Прошло 5 секунд");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
