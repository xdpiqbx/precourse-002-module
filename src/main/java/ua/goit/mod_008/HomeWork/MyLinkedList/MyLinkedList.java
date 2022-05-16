package ua.goit.mod_008.HomeWork.MyLinkedList;
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private Node<T> current;

    public boolean add(T data){
        Node<T> temp = this.last;
        Node<T> newNode = new Node(temp, null, data);
        this.last = newNode;
        if(first == null){
            this.first = newNode;
        }else{
            temp.next = newNode;
        }
        return true;
    }

    public void output() {
        current = first;
        while(current.next != null){
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
    public void outputReverse() {
        current = last;
        while(current.prev != null){
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
    }
}