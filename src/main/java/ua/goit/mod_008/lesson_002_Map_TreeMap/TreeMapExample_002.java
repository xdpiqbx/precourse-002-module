package ua.goit.mod_008.lesson_002_Map_TreeMap;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample_002 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
//                if (o1 < o2) {
//                    return 1;
//                } else if (o1 > o2) {
//                    return -1;
//                }
//                return 0;
                return Integer.compare(o1, o2);
            }
        };

        // for default behaviour you do not need comporator
        // if you need custom compare you must realize interface Comparable in object (Employee)
//        TreeMap<Integer, String> treeMap = new TreeMap<>(comparator);
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "val");
        treeMap.put(2, "dfvxvcv");
        treeMap.put(1, "vaxxl");
        treeMap.put(5, "ds");
        treeMap.put(7, "d;ls");
        treeMap.put(8, "ds");
        System.out.println(treeMap);

        SortedMap<Integer, String> headMap = treeMap.headMap(5, true);
        System.out.println("Head map: " + headMap);

        SortedMap<Integer, String> tailMap = treeMap.tailMap(5, false);
        System.out.println("Tail map: " + tailMap);
    }
}
