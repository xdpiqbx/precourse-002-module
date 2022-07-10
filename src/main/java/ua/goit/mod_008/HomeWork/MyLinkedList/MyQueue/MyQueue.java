package ua.goit.mod_008.HomeWork.MyLinkedList.MyQueue;

import java.util.NoSuchElementException;

/*
    add(Object value) добавляет элемент в конец
    remove(int index) удаляет элемент
    clear() очищает коллекцию
    size() возвращает размер коллекции
    peek() возвращает первый элемент в очереди (FIFO)
    poll() возвращает первый элемент в очереди и удаляет его из коллекции
*/

public class MyQueue<T> {
    private Node<T> first;
    private Node<T> last;
    private int queueSize = 0;
    public boolean add(T data){
        Node<T> newNode = new Node<>(data);
        if(this.first == null){
            this.first = newNode;
        }else{
            this.last.next = newNode;
        }
        this.last = newNode;
        this.queueSize++;
        return true;
    }
    public T remove() throws NoSuchElementException {
        if (queueSize == 0){
            throw new NoSuchElementException();
        }
        Node<T> current = this.first;
        T data = current.data;
        this.first = current.next;
        this.queueSize--;
        return data;
    }
    public T poll(){
        if (queueSize == 0){
            return null;
        }
        Node<T> current = this.first;
        T data = current.data;
        this.first = current.next;
        this.queueSize--;
        return data;
    }
    public T peek(){
        return queueSize != 0 ? this.first.data : null;
    }
    public int size(){
        return this.queueSize;
    }
    public void clear(){
        Node<T> current = this.first;
        while (current != null){
            Node<T> next = current.next;
            current.data = null;
            current.next = null;
            current = next;
        }
        this.first = this.last = null;
        this.queueSize = 0;
    }
    @Override
    public String toString() {
        if(this.queueSize == 0){
            return "Queue is empty";
        }
        Node<T> current = first;
        StringBuilder builder = new StringBuilder();
        while(current != null){
            Node<T> next = current.next;
            builder.append("\"").append(current.data).append(current.next != null ? "\", " : "\"");
            current = next;
        }
        return "[" + builder + "]";
    }
    private static class Node<T> {
        T data;
        Node<T> next;
        Node(T data) {
            this.data = data;
        }
    }
}
