package ua.goit.mod_008.HomeWork.MyHashMap;

import java.sql.Array;
import java.util.Objects;

public class MyHashMap <K, V> {
    private int initialCapacity = 16;
    private LinkedNodes<K, V> [] buckets = new LinkedNodes[initialCapacity];
    private int getBucket(int hash){
        return hash & (initialCapacity-1);
    }
    public V put(K key, V value){
        Node<K, V> node = new Node(key, value);
        int bucketIndex = getBucket(node.getHash());
        if (buckets[bucketIndex] == null){
            LinkedNodes<K, V> nodesList = new LinkedNodes<>();
            nodesList.addNode(node);
            buckets[bucketIndex] = nodesList;
            return node.getValue();
        }
        buckets[bucketIndex].addNode(node);
        return value;
    }

    public void testBuckets(){
        for (LinkedNodes<K, V> bucket: buckets) {
            System.out.println(bucket);
        }
    }
}
