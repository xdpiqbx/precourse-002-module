package ua.goit.mod_008.HomeWork.MyHashMap;

public class main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> myMap = new MyHashMap<>();

        System.out.println("<-=== .put(K key, V value) ===->");

        for (int i = 0; i < 160; i++) {
            myMap.put(i, "for: data "+i);
        }

        myMap.put(1, "T E S T - 1");
        myMap.put(17, "T E S T - 17");

        myMap.put(2, "T E S T - 2");
        myMap.put(18, "T E S T - 18");
        System.out.println(myMap);

        System.out.println("<-=== .size() ===->");
        System.out.println("myMap.size() = " + myMap.size());

        System.out.println("<-=== .get(K k) ===->");
        for (int i = 45; i < 50; i++) {
            System.out.println(myMap.get(i));
        }
        // key not exist test
        System.out.println(myMap.get(100500)); // null

        System.out.println("<-=== .remove(K k) ===->");
        System.out.println("myMap.remove(10) = " + myMap.remove(10));
        System.out.println("myMap.remove(11) = " + myMap.remove(11));
        System.out.println("myMap.remove(12) = " + myMap.remove(12));
        System.out.println("myMap.remove(12) = " + myMap.remove(12)); // null
        System.out.println("myMap.remove(12) = " + myMap.remove(12)); // null
        System.out.println("myMap.size() = " + myMap.size());
        System.out.println(myMap);

        myMap.clear();
        System.out.println(myMap);
    }
}
