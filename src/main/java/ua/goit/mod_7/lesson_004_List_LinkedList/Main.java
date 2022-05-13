package ua.goit.mod_7.lesson_004_List_LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> classB = new LinkedList<>();
        classB.add("Sam");
        classB.add("El");
        List<String> classA = new LinkedList<>();
        classA.add("Bill");
        classA.add(0, "John"); // first in list classA
        classA.add("Smith");

//        classA.addAll(classB); // add to and
        classA.addAll(0, classB); // add to start

        System.out.println(
            classA.contains("John") // true
        );
        System.out.println(
            classA.contains("john") // false
        );

        System.out.println(classA);

        classA.remove("John");

        System.out.println(classA);

        for (String node: classA) {
            System.out.println(node);
        }

        System.out.println(classA.lastIndexOf("El"));
    }
}
