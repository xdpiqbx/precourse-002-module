package ua.goit.mod_008.HomeWork.MyLinkedList;

import java.util.LinkedList;

public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private Node<T> current;

    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if (this.first == null){
            this.first = newNode;
        }else{
            current = this.first;
            while(current.next != null){
                current.prev = current;
                current = current.next;
            }
            last = current.next = newNode;
        }
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

        Node(T data) {
            this.data = data;
        }
    }
}

/*
     private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode;
        else
            f.prev = newNode;
        size++;
        modCount++;
    }

    void linkLast(E e) {
        final LinkedList.Node<E> l = last;
        final LinkedList.Node<E> newNode = new LinkedList.Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
        modCount++;
    }
*/
