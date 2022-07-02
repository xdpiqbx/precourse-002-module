package ua.goit.mod_008.lesson_001_Map_HashMap_LinkedHashMap;

import java.util.Collections;
import java.util.Map;

public class MapUtilityMethods {
    public static void main(String[] args) {
        // to get immutable Empty Map
        Collections.emptyMap();

        // Non-empty map
        Map<String, Integer> peopleAge = Map.of(
                "Igor", 30,
                "Max", 30,
                "John", 25
        );
        System.out.println("peopleAge = " + peopleAge);
    }
    public static Map<String, Integer> getSmth(){
        return Collections.emptyMap();
    }
}
