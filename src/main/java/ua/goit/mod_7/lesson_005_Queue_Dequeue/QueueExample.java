package ua.goit.mod_7.lesson_005_Queue_Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<String> qQueue = new LinkedList<>();
//        Queue<String> qQueue = new PriorityQueue<>(); // this(DEFAULT_INITIAL_CAPACITY, null);
        Deque<String> qQueue = new LinkedList<>();
        qQueue.add("Alex");
        qQueue.add("Pedro");
        qQueue.add("Bill");
        qQueue.add("John");
        qQueue.offer("Smith");
        System.out.println("Before changes: " + qQueue); // [Alex, Pedro, Bill, John, Smith]

//        String removed = qQueue.remove(); // remove first element (if empty - exception)
//        String polled = qQueue.poll(); // remove first element (if empty - null)
//
//        System.out.println("=====");
//        System.out.printf(
//                "After remove and poll: " + qQueue
//                +"%nRemoved %s"
//                +"%nPolled %s", removed, polled
//        );

        System.out.println("=== element()  peek() ===");
        String element = qQueue.element(); // return first element (if empty - exception)
        System.out.println("Element :" + element + " => " + qQueue);
        String peek = qQueue.peek(); // return first element (if empty - null)
        System.out.println("Peek :" + peek + " => " + qQueue);
    }
}
