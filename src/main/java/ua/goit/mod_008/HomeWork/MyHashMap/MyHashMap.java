package ua.goit.mod_008.HomeWork.MyHashMap;

import java.util.List;
import java.util.Objects;

public class MyHashMap <K, V> {
    private Node<K,V>[] bucketsArray;
    private int totalNumberOfNodes = 0;
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    public MyHashMap(){
        bucketsArray = new Node[DEFAULT_INITIAL_CAPACITY];
    }

    public boolean put(K key, V value){
        Node <K, V> newNode = new Node<>(key, value, null);
        int bucketIndex = this.indexOfTargetBucketCell(newNode);
        if (bucketsArray[bucketIndex] == null){
            return simpleAdd(bucketIndex, newNode);
        }

        List<Node<K,V>> nodeList = bucketsArray[bucketIndex].getNodes();

        return true;
    }

    private boolean simpleAdd(int index, Node<K,V> newNode){
        bucketsArray[index] = new Node<>(null, null);
        bucketsArray[index].getNodes().add();
        return true;
    }

    static class Node<K, V>{
        final int iHash;
        K key;
        V value;
        Node<K,V> next;
        Node(K key, V value, Node<K,V> next) {
            this.iHash = this.hashCode();
            this.key = key;
            this.value = value;
            this.next = next;
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
    private int indexOfTargetBucketCell(Node<K, V> node){
        return node.iHash % bucketsArray.length;
    }
}
