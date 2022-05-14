package ua.goit.mod_008.lesson_001_Map_HashMap_LinkedHashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>(); // <Key, Value>
        // add element to map
        capitals.put("Germany", "Berlin");
        capitals.put("Ukraine", "Kyiv");
        capitals.put("Spain", "Madrid");
        capitals.put(null, "null value");
        System.out.println(capitals); // {Ukraine=Kyiv, Germany=Berlin, Spain=Madrid}

        // get element from map
        String germany = capitals.get("Germany");
        System.out.println(germany); // Berlin


        // --------------------------
        System.out.println("Size: " + capitals.size());

        // --------------------------
        Set<String> keySet = capitals.keySet();
        System.out.println(keySet);

        // --------------------------
        Collection<String> values = capitals.values();
        System.out.println(values);

        // --------------------------
        Set<Map.Entry<String, String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Entries ===> : ");
            System.out.println("HashCode: " + entry.hashCode());
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        // remove element from map
        capitals.remove("Germany"); // {Ukraine=Kyiv, Spain=Madrid}
        capitals.clear(); // {}
        System.out.println(capitals);
    }
}
