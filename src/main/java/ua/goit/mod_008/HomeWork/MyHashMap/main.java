package ua.goit.mod_008.HomeWork.MyHashMap;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
import java.security.NoSuchAlgorithmException;
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
        System.out.println(hashMap);
        System.out.println("Size: " + hashMap.size()); // return int
        System.out.println("get(): " + hashMap.get(30)); // return V
        System.out.println("remove(): " + hashMap.remove(10)); // return V
        System.out.println(hashMap);
        hashMap.clear(); // void
        System.out.println(hashMap);

        System.out.println("##################################");

        LinkedNodes<Integer, String> list = new LinkedNodes<>();
        list.add(1, "Bill");
        list.add(2, "John");
        list.add(3, "Will");
        list.add(4, "Stan");
        list.printList();

        MyHashMap<Integer, String> myMap = new MyHashMap<>();

        myMap.put(1, "test");
        myMap.testBuckets();

//        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
//        myHashMap.put(1, "One");
//        myHashMap.put(2, "Two");
//        myHashMap.put(3, "Three");
//        myHashMap.put(4, "Four");
//        myHashMap.put(5, "Five");
//        myHashMap.put(6, "Six");
//        myHashMap.put(7, "Seven");
//        myHashMap.put(8, "Eight");
//        myHashMap.put(9, "Nine");
//        myHashMap.put(10, "Ten");
//        System.out.println(myHashMap);
    }
}
