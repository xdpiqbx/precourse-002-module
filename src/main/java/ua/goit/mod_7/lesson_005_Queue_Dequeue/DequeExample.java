package ua.goit.mod_7.lesson_005_Queue_Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dDeque = new LinkedList<>();
        dDeque.add("Alex");
        dDeque.add("Pedro");
        dDeque.add("Bill");
        dDeque.add("John");

        dDeque.offer("Smith");
        dDeque.addFirst("Takashi");
        dDeque.addLast("Kovach");
        System.out.println(dDeque);
    }
}
