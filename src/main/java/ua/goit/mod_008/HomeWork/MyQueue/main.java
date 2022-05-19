package ua.goit.mod_008.HomeWork.MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
    /*
        add(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом ***** Очередь так не делает!!!
        clear() очищает коллекцию
        size() возвращает размер коллекции
        peek() возвращает первый элемент в очереди (FIFO)
        poll() возвращает первый элемент в очереди и удаляет его из коллекции
    */
        Queue<String> qQueue = new LinkedList<>();
        qQueue.add("Queue 001");
        qQueue.add("Queue 002");
        qQueue.add("Queue 003");
        qQueue.add("Queue 004");
        qQueue.add("Queue 005");
        qQueue.remove(0);
        System.out.println(qQueue);
    }
}
