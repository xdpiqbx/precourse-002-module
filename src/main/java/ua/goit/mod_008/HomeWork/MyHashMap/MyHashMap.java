package ua.goit.mod_008.HomeWork.MyHashMap;

import java.util.Arrays;
import java.util.Objects;

public class MyHashMap <K, V> {
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int totalNumberOfNodes = 0;
    private Node<K,V>[] bucketsArray = new Node[DEFAULT_INITIAL_CAPACITY];

    public boolean put(K key, V value){
        Node <K, V> newNode = new Node<>(key, value, null);
        int bucketIndex = this.indexOfTargetBucketCell(newNode.iHash);
        if (this.bucketsArray[bucketIndex] == null){
            this.bucketsArray[bucketIndex] = newNode;
        }
        this.bucketsArray[bucketIndex].next = newNode;
        totalNumberOfNodes++;

        int bucketsArrayLength = this.bucketsArray.length;
        for (int i = 0; i < bucketsArrayLength; i++) {
            System.out.println(this.bucketsArray[i].value);
        }

        return true;
    }
    public void mapToString(){
        System.out.println(this.bucketsArray.length);
//        System.out.println(this.bucketsArray[0].value);
        System.out.println(this.totalNumberOfNodes);
        int bucketsArrayLength = this.bucketsArray.length;

//        for (int i = 0; i < bucketsArrayLength; i++) {
//            System.out.println(
//                this.bucketsArray[i].value
//            );
//        }
    }
    private int indexOfTargetBucketCell(int nodeHash){
        return nodeHash % bucketsArray.length;
    }

    static private class Node<K, V>{
        final int iHash;
        K key;
        V value;
        Node<K,V> next;
        Node(K key, V value, Node<K,V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.iHash = this.hashCode();
        }

        @Override
        public String toString() {
            return "Node {" + key + "=" + value + "}";
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?, ?> node = (Node<?, ?>) o;
            if (iHash != node.iHash) return false;
            if (!Objects.equals(key, node.key)) return false;
            return Objects.equals(value, node.value);
        }
        @Override
        public int hashCode() {
            int result = iHash;
            result = 31 * result + (key != null ? key.hashCode() : 0);
            result = 31 * result + (value != null ? value.hashCode() : 0);
            return result;
        }
    }
}
