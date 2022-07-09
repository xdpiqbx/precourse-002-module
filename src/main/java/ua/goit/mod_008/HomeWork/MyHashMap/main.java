package ua.goit.mod_008.HomeWork.MyHashMap;

import java.util.*;

/*
Написать свой класс MyHashMap как аналог классу HashMap.

Нужно делать с помощью односвязной Node.

Не может хранить две ноды с одинаковых ключами одновременно.

Методы

put(Object key, Object value) добавляет пару ключ + значение
size() возвращает размер коллекции
get(Object key) возвращает значение (Object value) по ключу
remove(Object key) удаляет пару по ключу
clear() очищает коллекцию
*/

public class main {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(); // <Key, Value>
        hashMap.put(10, "Bill"); // return V
        hashMap.put(20, "John");
        hashMap.put(30, "Stan");
        hashMap.put(40, "Will");
        hashMap.put(40, "Stanley");
        System.out.println(hashMap);
        System.out.println("Size: " + hashMap.size()); // return int
        System.out.println("get(): " + hashMap.get(30)); // return V
        System.out.println("remove(): " + hashMap.remove(10)); // return V
        System.out.println(hashMap);
        hashMap.clear(); // void
        System.out.println(hashMap);

        System.out.println("##################################");

        MyHashMap<Integer, String> myMap = new MyHashMap<>();
        myMap.put(1, "test1");
        myMap.put(17, "test17");
        myMap.put(33, "test33");
        myMap.put(49, "test49");
        myMap.put(65, "test65");
        myMap.put(2, "test2");
        myMap.put(2, "test000");
        myMap.put(17, "test17777");

        System.out.println(myMap);
        myMap.clear();
//        myMap.remove(65);
//        myMap.remove(49);
//        myMap.remove(33);
//        myMap.remove(17);
//        myMap.remove(1);
//        myMap.remove(2);
        System.out.println("====================");
        System.out.println(myMap);
    }
}
