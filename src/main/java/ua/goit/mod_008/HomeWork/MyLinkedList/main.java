package ua.goit.mod_008.HomeWork.MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

/*
    - +++`add(Object value)` добавляет элемент в конец
    - `remove(int index)` удаляет элемент под индексом (і повертає його)
    - `clear()` очищает коллекцию
    - +++`size()` возвращает размер коллекции
    - +++`get(int index)` возвращает элемент под индексом
*/

public class main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);
        list.add("first");
        list.add("second");
        System.out.println(
            list.add("third") // **** METHOD behaviour - added and return true
        );
        list.add("fourth");
        System.out.println(list);
        System.out.println(
            list.remove(0) // **** METHOD behaviour - remove and return
        );
        System.out.println(list);
        System.out.println(list.size());// **** METHOD behaviour
        System.out.println(list.get(0));// **** METHOD behaviour
        list.clear();// **** METHOD behaviour
        System.out.println(list);

        System.out.println("=== MyLinkedList ===");

        MyLinkedList<String> myList = new MyLinkedList<>();
        myList.add("first MY 001");
        myList.add("first MY 002");
        myList.add("first MY 003");
        myList.add("first MY 004");
        myList.add("first MY 005");
        myList.add("first MY 006");
        myList.add("first MY 007");
        myList.output();
        System.out.println("================");
        System.out.println(myList.size());
        System.out.println(myList.get(4));
    }
}
