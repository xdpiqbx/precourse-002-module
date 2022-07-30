package ua.goit.mod_009.lesson_005_generics.break_type_tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BreakTypeTests {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
//        items.add(1); // error!
        List anotherList = items;
        anotherList.add(1); // Ok=)
        anotherList.add("Test"); // Ok=)
        anotherList.add(Map.of("key", 150)); // Ok=)

        // When toString - OK!
        System.out.println("items = " + items);
        System.out.println("anotherList = " + anotherList);

//        System.out.println(items.get(2)); // Error!!!
        System.out.println(anotherList.get(2)); // {key=150}

        // It work like Object
        for (Object o: items) {
            System.out.println("o = " + o);
            System.out.println("o.getClass() = " + o.getClass());
        }
    }
}
