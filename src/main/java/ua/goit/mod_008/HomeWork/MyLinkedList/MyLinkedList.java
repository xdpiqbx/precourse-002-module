package ua.goit.mod_008.HomeWork.MyLinkedList;
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int listIndex;
    public boolean add(T data){
        Node<T> tempLastNode = this.last;
        Node<T> newNode = new Node(tempLastNode, null, data);
        this.last = newNode;
        if(first == null){
            this.first = newNode;
            listIndex = 0;
        }else{
            tempLastNode.next = newNode;
            listIndex++;
            System.out.println(newNode.hasNext());
        }
        return true;
    }
    public int size(){
        return this.listIndex + 1;
    }
    public T get(int index) {
        Node<T> current = first;
        int tempIndex = 0;
        while(current.hasNext()){
            if(index == tempIndex){
                break;
            }
            current = current.next;
            tempIndex++;
        }
        return current.data;
    }
    public void output() {
        Node<T> current = first;
        while(current.hasNext()){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
    public void outputReverse() {
        Node<T> current = last;
        while(current.hasPrev()){
            System.out.println(current.data);
            current = current.prev;
        }
        System.out.println(current.data);
    }
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;
        Node(Node<T>prev, Node<T>next, T data) {
            this.prev = prev;
            this.data = data;
            this.next = next;
        }
        boolean hasNext(){
            return this.next != null;
        }
        boolean hasPrev(){
            return this.prev != null;
        }
    }
}