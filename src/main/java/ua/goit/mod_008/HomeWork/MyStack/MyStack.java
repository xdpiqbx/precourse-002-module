package ua.goit.mod_008.HomeWork.MyStack;

import ua.goit.mod_008.HomeWork.MyQueue.MyQueue;

public class MyStack<T> {
    private Node<T> first;
    private Node<T> last;
    private int stackSize = 0;
    public boolean push(T data){
        Node<T> newNode = new Node<>(data);
        if(this.first == null){
            this.first = newNode;
        }else{
            this.last.next = newNode;
        }
        this.last = newNode;
        this.stackSize++;
        return true;
    }
    public int size(){
        return this.size();
    }
    public void clear(){
        Node<T> current = this.first;
        Node<T> next = null;
        while (current != null){
            next = current.next;
            current.data = null;
            current.next = null;
            current = next;
        }
        this.first = this.last = null;
        this.stackSize = 0;
    }
    @Override
    public String toString() {
        if(this.stackSize == 0){
            return "Stack is empty";
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
