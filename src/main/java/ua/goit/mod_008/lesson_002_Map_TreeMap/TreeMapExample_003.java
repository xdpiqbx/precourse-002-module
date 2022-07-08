package ua.goit.mod_008.lesson_002_Map_TreeMap;

import ua.goit.mod_008.lesson_002_Map_TreeMap.lesson_001_Map_HashMap_LinkedHashMap.Employee;

import java.util.TreeMap;

public class TreeMapExample_003 {
    public static void main(String[] args) {
        // for default behaviour you do not need comporator
        // if you need custom compare you must realize interface Comparable in object (ex. Employee)
        TreeMap<Employee, String> treeMap = new TreeMap<>();
        Employee employee1 = new Employee(1, "Alex");
        Employee employee2 = new Employee(5, "Bill");
        Employee employee3 = new Employee(3, "Ihor");
        treeMap.put(employee1, "Ukraine");
        treeMap.put(employee2, "France");
        treeMap.put(employee3, "USA");
        System.out.println(treeMap);
    }
}
