package ua.goit.mod_008.HomeWork.MyHashMap;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

public class MyHashMap <K, V> {
    private Node<K,V>[] bucketsArray;
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
            return Objects.equals(this.key, node.key);
        }

    }
    public String convertToSHA256 (String str) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        StringBuffer hexStr = new StringBuffer();
        for (byte dig: digest) {
            hexStr.append(Integer.toHexString(0xFF & dig));
        }
        return hexStr.toString();
    }
//    static final int hash(Object key) {
//        int h;
//        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
//    }

//    public V put(K key, V value) {
//        totalNumberOfNodes++;
//        return putVal(hash(key), key, value, false, true);
//    }
    Node<K,V> newNode(int hash, K key, V value, Node<K,V> next) {
        return new Node<>(hash, key, value, next);
    }
}
