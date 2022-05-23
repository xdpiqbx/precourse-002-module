package ua.goit.mod_008.HomeWork.MyHashMap;

import java.util.Objects;

public class MyHashMap <K, V> {
    private Node<K,V>[] bucketsArray;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private int totalNumberOfNodes = 0;
    static class Node<K, V>{
        final int iHash;
        final K key;
        V value;
        Node<K,V> next;
        Node(int iHash, K key, V value, Node<K,V> next) {
            this.iHash = iHash;
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
        private int indexOfTargetBucketCell(){
            int target = hashCode() % DEFAULT_INITIAL_CAPACITY;
            return target;
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
