package ua.goit.mod_008.lesson_003_Set_HashSet_LinkedHashSet_TreeSet;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        set.add("England");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add("Ukraine");
        set.add(null);

        boolean isUkraineExists = set.contains("Ukraine");
        System.out.println("Is Ukraine Exists: " + isUkraineExists);
        System.out.println(set); // [null, Ukraine, England]
        set.remove("England");
        System.out.println(set); // [null, Ukraine]
    }
}
