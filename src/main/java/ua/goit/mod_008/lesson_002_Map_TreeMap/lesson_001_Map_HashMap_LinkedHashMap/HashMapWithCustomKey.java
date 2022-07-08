package ua.goit.mod_008.lesson_002_Map_TreeMap.lesson_001_Map_HashMap_LinkedHashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithCustomKey {
    public static void main(String[] args) {

        // 1. o1.equals(o2) -> o1.hashcode() == o2.hashcode()
        // 2. o1.hashcode() == o2.hashcode() ??!! o1.equals(o2)

        Map<Employee, String> employees = new HashMap<>();

        Employee alex = new Employee(1, "Alex");
        employees.put(alex, "Ukraine");

        Employee john = new Employee(1, "Alex"); // same data in key!
        employees.put(john, "London");

        System.out.println(employees);

        String bill = employees.get(alex);
        System.out.println("Bill: " + bill);
        System.out.println(employees);
    }
}
