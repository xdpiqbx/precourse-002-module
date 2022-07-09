package ua.goit.mod_008.HomeWork.MyHashMap;

public class LinkedNodes<K, V> {
    private Node<K, V> first;

    public void add(K key, V value){
        Node<K, V> node = new Node<>(key, value);
        if(this.first == null){
            this.first = node;
            return;
        }
        Node<K, V> last = first;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(node);
    }

    public void addNode(Node<K, V> node){
        if(this.first == null){
            this.first = node;
            return;
        }
        Node<K, V> last = first;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(node);
    }

    public void printList(){
        Node <K, V> node = first;
        while(node != null){
            System.out.println(node);
            node = node.getNext();
        }
    }

//    public V remove(K key){
//
//    }

    public V get(K key){
        Node <K, V> node = first;
        while(node != null){
            node = node.getNext();
            if (node.getKey().equals(key)){
                return node.getValue();
            }
        }
        return null;
    }
}
