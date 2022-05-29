package ua.goit.mod_009.lesson_005_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo_003 {
    public static void main(String[] args) {
        Integer element = 10;
        Object object = null;
        object = element; // **************** OK
        System.out.println(object);
        // *************************************

        List<Integer> list = new ArrayList<>();
        List<Object> objects = null;
        // objects = list; // **************** ERROR

        GenericType_001<Number> type = new GenericType_001<>();
        GenericUtils.isEquals(type, type);
    }
}
