package ua.goit.mod_008.HomeWork.MyLinkedList;

import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        System.out.println("=== MyLinkedList ===");

        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("MY 001");
        myList.add("MY 002");
        myList.add("MY 003");
        myList.add("MY 004");
        myList.add("MY 005");
        myList.add("MY 006");
        myList.add("MY 007");
        System.out.println(myList);

        System.out.println("\r\nsize() " + myList.size());
        System.out.println("get(6) => \"" + myList.get(4) + "\"");

        System.out.println("\r\n=== Remove output ===");
        System.out.println("removed by index 3 => \"" + myList.remove(3) + "\"");

        System.out.println("\r\n=== .size() ===");
        System.out.println("size() " + myList.size());
        System.out.println(myList);

        System.out.println("\r\n=== Output Reverse ===");
        System.out.println(myList.outputReverse());
        myList.clear();
        System.out.println("\r\n=== After clear ===");
        System.out.println(myList);
    }
}
