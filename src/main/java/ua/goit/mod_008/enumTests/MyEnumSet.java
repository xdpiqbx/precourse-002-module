package ua.goit.mod_008.enumTests;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MyEnumSet {
    public static <T> Set<T> of(Class<T> cl){
        Object[] enumConstants = cl.getEnumConstants();
        Set<T> result = new HashSet<>(Arrays.asList(cl.getEnumConstants()));
        System.out.println("Arrays.toString(enumConstants) = " + Arrays.toString(enumConstants));
        return result;
    }

    public static void main(String[] args) {
//        System.out.println("Season.class = " + Season.class);
//        Season.class.getEnumConstants();
        System.out.println("MyEnumSet.of(Season.class) = " + MyEnumSet.of(Season.class));
    }
}
