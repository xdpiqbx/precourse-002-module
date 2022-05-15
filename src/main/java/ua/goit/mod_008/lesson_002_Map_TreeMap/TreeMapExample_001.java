package ua.goit.mod_008.lesson_002_Map_TreeMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample_001 {
    public static void main(String[] args) {
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
