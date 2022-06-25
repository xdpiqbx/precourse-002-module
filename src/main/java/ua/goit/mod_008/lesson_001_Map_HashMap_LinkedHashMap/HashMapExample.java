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
        System.out.println("Capitals --------------------------");
        System.out.println(capitals); // {Ukraine=Kyiv, Germany=Berlin, Spain=Madrid}

        // -------------------------- .get() element from map
        System.out.println(".get()-----------------------------");
        System.out.println(capitals.get("Germany")); // Berlin


        // -------------------------- .size()
        System.out.println(".size()----------------------------");
        System.out.println("Size: " + capitals.size());

        // -------------------------- .keySet()
        Set<String> keySet = capitals.keySet(); // ------------------- Set<String>
        System.out.println(".keySet()--------------------------");
        System.out.println(keySet);

        System.out.println(".keySet()--foreach-----------------");
        for (String key: capitals.keySet()) {
            String value = capitals.get(key);
            System.out.printf("%s = %s\n", key, value);
        }

        // -------------------------- .values()
        Collection<String> values = capitals.values(); // ------------ Collection<String>
        System.out.println(".values()--------------------------");
        System.out.println(values);

        System.out.println(".containsKey()-.containsValue()----");
        System.out.println(capitals.containsKey("Ukraine"));
        System.out.println(capitals.containsValue("Madrid"));

        // --------------------------
        Set<Map.Entry<String, String>> entries = capitals.entrySet(); // Set<Map.Entry<String, String>>
        System.out.println(".entrySet()------------------------");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Entries ===> : ");
            System.out.println("HashCode: " + entry.hashCode());
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }



        // remove element from map
        System.out.println(".remove()-------------------------");
        System.out.println(capitals.remove("Germany")); // {Ukraine=Kyiv, Spain=Madrid}
        System.out.println(".clear()--------------------------");
        capitals.clear(); // {}
        System.out.println(capitals);
    }
}
