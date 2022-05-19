package ua.goit.mod_008.HomeWork.MyQueue;

import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
    /*
        add(Object value) добавляет элемент в конец
        remove(int index) удаляет элемент под индексом ***** Очередь не так работает... удалить голову)
        clear() очищает коллекцию
        size() возвращает размер коллекции
        peek() возвращает первый элемент в очереди (FIFO)
        poll() возвращает первый элемент в очереди и удаляет его из коллекции
    */
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.add("My Queue 001");
        myQueue.add("My Queue 002");
        myQueue.add("My Queue 003");
        myQueue.add("My Queue 004");
        myQueue.add("My Queue 005");

        System.out.println(myQueue);

        System.out.println("\r\n=== .remove() ===");
        System.out.println("Removed: \"" + myQueue.remove()+"\"");

        System.out.println("\r\n=== .size() ===");
        System.out.println("Queue size: " + myQueue.size());

        System.out.println("\r\n=== .peek() ===");
        System.out.println("peek: \"" + myQueue.peek() + "\"");

        System.out.println("\r\n=== .poll() ===");
        System.out.println("poll: \"" + myQueue.poll() + "\"");

        System.out.println("\r\n=== .clear() ===");
        myQueue.clear();

        System.out.println(myQueue);

        System.out.println("\r\n=== .peek() after .clear() ===");
        System.out.println("peek: \"" + myQueue.peek() + "\"");

        System.out.println("\r\n=== .poll() after .clear() ===");
        System.out.println("poll: \"" + myQueue.poll() + "\"");

        System.out.println("\r\n=== .remove() after .clear() ===");
        System.out.println("Removed: \"" + myQueue.remove()+"\"");
    }
}
