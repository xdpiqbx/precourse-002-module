package ua.goit.mod_008.lesson_002_Map_TreeMap.lesson_001_Map_HashMap_LinkedHashMap;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueNullTest {
    public static void main(String[] args) {
        Queue<Integer> numbers = new ArrayDeque<>();
        // numbers.add(null); // NullPointerException
        System.out.println("numbers.poll() = " + numbers.poll());
    }
}
