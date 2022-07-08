package ua.goit.mod_008.HomeWork.MyHashMap;

import java.sql.Array;
import java.util.Objects;

public class MyHashMap <K, V> {
    private int capacity = 16;
    private LinkedNodes<K, V> [] buckets;
    private int useBucket(int hash){
        return hash & (capacity-1);
    }
}
