package ua.goit.mod_008.HomeWork.MyStack;

import java.util.EmptyStackException;

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
    public T remove(int index){
        Node<T> current = this.findNodeByIndex(index);
        T data = current.data;
        if(index == 0) {
            this.first = current.next;
        }else{
            Node<T> prev = this.findNodeByIndex(index - 1);
            prev.next = current.next;
        }
        current = null;
        this.stackSize--;
        return data;
    }
    public T peak() throws EmptyStackException {
        if(this.size() == 0){
            throw new EmptyStackException();
        }
        return this.last.data;
    }
    public T pop() throws EmptyStackException {
        T data = null;
        if(this.size() == 0){
            throw new EmptyStackException();
        } else if (this.size() == 1) {
            data = this.first.data;
            this.first = null;
        }else{
            int lastIndex = this.getLastIndexOfStack();
            int prevIndex = lastIndex == 0 ? 0 : lastIndex - 1;
            Node<T> prev = this.findNodeByIndex(prevIndex);
            data = prev.next.data;
            this.last = prev;
            prev.next= null;
        }
        this.stackSize--;
        return data;
    }
    private Node<T> findNodeByIndex(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.stackSize){
            throw new IndexOutOfBoundsException();
        }
        return this.searchNodeFromStart(index);
    }
    private Node<T> searchNodeFromStart(int index){
        Node<T> current = this.first;
        int tempIndex = 0;
        while(current.hasNext()) {
            if (index == tempIndex) {
                break;
            }
            current = current.next;
            tempIndex++;
        }
        return current;
    }
    public int size(){
        return this.stackSize;
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
    private Integer getLastIndexOfStack(){
        return this.stackSize != 0 ? this.stackSize - 1 : 0;
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
        boolean hasNext(){
            return this.next != null;
        }
    }
}
