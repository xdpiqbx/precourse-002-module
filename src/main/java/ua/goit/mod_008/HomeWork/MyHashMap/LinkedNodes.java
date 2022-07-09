package ua.goit.mod_008.HomeWork.MyHashMap;

public class LinkedNodes<K, V> {
    private Node<K, V> first;
    private int listSize = 0;
    public int getListSize() {
        return this.listSize;
    }

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
        this.listSize++;
        // is key arady exist, update val if true!!!
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

    public String toString(){
        StringBuilder result = new StringBuilder();
        Node <K, V> node = first;
        while(node != null){
            result.append("{").append(node).append("}");
            node = node.getNext();
        }
        return result.toString();
    }

    public V remove(K key){
        if (first == null){
            return null;
        }
        Node <K, V> node = first;
        if(node.getNext() == null){
            V val = node.getValue();
            this.listSize--;
            return val;
        }
        Node <K, V> prevNode = node;
        while(node != null){
            if (node.getKey().equals(key)){
                V val = node.getValue();
                if(node.equals(prevNode)){ // remove first el in list
                    this.first = this.first.getNext();
                }
                prevNode.setNext(node.getNext());
                node.setNext(null);
                this.listSize--;
                return val;
            }
            prevNode = node;
            node = node.getNext();
        }
        return null;
    }

    public V get(K key){
        Node <K, V> node = first;
        while(node != null){
            if (node.getKey().equals(key)){
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }
    public V getByHash(int hash){
        Node <K, V> node = first;
        while(node != null){
            if (node.getHash() == hash){
                return node.getValue();
            }
            node = node.getNext();
        }
        return null;
    }
    public Node<K, V> getNodeByHash(int hash){
        Node <K, V> node = first;
        while(node != null){
            if (node.getHash() == hash){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
    public boolean isKeyExists(int keyHash){
        Node <K, V> node = first;
        while(node != null){
            if (node.getHash() == keyHash){
                return true;
            }
            node = node.getNext();
        }
        return false;
    }
}
