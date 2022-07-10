package ua.goit.mod_008.HomeWork.MyHashMap;

import java.util.Objects;

public class MyHashMap <K, V> {
    private int initialCapacity = 16;
    private int collecitonSize = 0;
    private LinkedNodes<K, V> [] buckets = new LinkedNodes[initialCapacity];
    private int getBucketIndex(int hash){
        return hash & (initialCapacity-1);
    }

    public int size() {
        return collecitonSize;
    }

    public V put(K key, V value){
        Node<K, V> node = new Node<>(key, value);
        int bucketIndex = getBucketIndex(node.getHash());
        if (buckets[bucketIndex] == null){
            LinkedNodes<K, V> nodesList = new LinkedNodes<>();
            nodesList.addNode(node);
            buckets[bucketIndex] = nodesList;
            this.collecitonSize++;
            return node.getValue();
        }
        if(this.isKeyExists(key, bucketIndex)){
            this.updateValueIfKeyExist(key, value, bucketIndex);
            return node.getValue();
        }
        buckets[bucketIndex].addNode(node);
        this.collecitonSize++;
        return node.getValue();
    }
    private void updateValueIfKeyExist(K key, V value, int bucketIndex){
        int keyHash = Objects.hash(key);
        this.buckets[bucketIndex].getNodeByHash(keyHash).setValue(value);
    }
    private boolean isKeyExists(K key, int bucketIndex){
        int keyHash = Objects.hash(key);
        return this.buckets[bucketIndex].isKeyExists(keyHash);
    }
    public V get(K key){
        int keyHash = Objects.hash(key);
        int bucketIndex = this.getBucketIndex(keyHash);
        if(this.buckets[bucketIndex] == null){
            return null;
        }
        return this.buckets[bucketIndex].getByHash(keyHash);
    }

    public V remove(K key){
        int keyHash = Objects.hash(key);
        int bucketIndex = this.getBucketIndex(keyHash);
        if(this.buckets[bucketIndex] == null){
            return null;
        }
        if(this.buckets[bucketIndex].getListSize() == 1){
            V val = this.buckets[bucketIndex].getByHash(keyHash);
            this.buckets[bucketIndex] = null;
            this.collecitonSize--;
            return val;
        }
        V removeResult = this.buckets[bucketIndex].remove(key);
        if(removeResult == null){
            return null;
        }
        this.collecitonSize--;
        return removeResult;
    }

    public void clear(){
        int len = buckets.length;
        for (int i = 0; i < len; i++) {
            buckets[i] = null;
        }
        this.collecitonSize = 0;
    }

    @Override
    public String toString(){
        int bucketIndex = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("----------------------------------\n\r");
        sb.append("MyHashMap size: "+this.size()+"\n\r");
        for (LinkedNodes<K, V> bucket: buckets) {
            sb.append("[").append(bucketIndex).append(" => ").append(bucket).append("]\n\r");
            bucketIndex++;
        }
        sb.append("----------------------------------\n\r");
        return sb.toString();
    }
}
