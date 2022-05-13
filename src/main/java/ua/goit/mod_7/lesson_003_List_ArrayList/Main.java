package ua.goit.mod_7.lesson_003_List_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(1000); // DEFAULT_CAPACITY = 10;
        list.add("First");
        list.add("Second");
        list.add("Third");

        for (String item: list) {
            System.out.println(item);
        }
        // list.trimToSize(); // trimmed array to  minimu size
        list.add(1, "Fifth");
        System.out.println("==============");
        Collections.sort(list);
        for (String item: list) {
            System.out.println(item);
        }
        list.isEmpty();
        System.out.println("==============");
        System.out.println(list.get(1));

        System.out.println("==============");
        List<String> strings = list.subList(1, 3);
        for (String item: strings) {
            System.out.println(item);
        }
    }
}
