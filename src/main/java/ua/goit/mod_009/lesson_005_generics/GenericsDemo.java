package ua.goit.mod_009.lesson_005_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GenericsDemo {
    public static void main(String[] args) {
        // Set unicSet = new TreeSet();
        // unicSet.add(100L);
        // unicSet.add("Hello");
        // unicSet.add(123);
        // System.out.println(unicSet);
        // Exception in thread "main" java.lang.ClassCastException:
        // class java.lang.Long cannot be cast to class java.lang.String
        // (java.lang.Long and java.lang.String are in module java.base of loader 'bootstrap')

        List<String> list = new ArrayList<>();
        // list.add(100L);
        list.add("Hello");
        System.out.println(list);
        printElement(list);
    }
    private static void printElement(List<String> list){
        for (Object el: list) {
            System.out.println(el);
        }
    }
}
