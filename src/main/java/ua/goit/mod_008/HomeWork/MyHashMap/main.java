package ua.goit.mod_008.HomeWork.MyHashMap;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

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
        hashMap.put(10, "Bill");
        hashMap.put(20, "John");
        hashMap.put(30, "Stan");
        hashMap.put(40, "Will");
        System.out.println(hashMap);
        System.out.println("Size: " + hashMap.size());
        System.out.println("get(): " + hashMap.get(30));
        System.out.println("remove(): " + hashMap.remove(10));
        System.out.println(hashMap);
        hashMap.clear();
        System.out.println(hashMap);

        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        try{
            myHashMap.convertToSHA256("test");
            myHashMap.convertToSHA256("test");
            myHashMap.convertToSHA256("test2");
        }catch (NoSuchAlgorithmException err){
            System.out.println(err.toString());
        }
    }
}
