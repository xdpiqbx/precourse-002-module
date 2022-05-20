package ua.goit.mod_008.HomeWork.MyLinkedList;

/*
    - `add(Object value)` добавляет элемент в конец
    - `remove(int index)` удаляет элемент под индексом (і повертає його)
    - `clear()` очищает коллекцию
    - `size()` возвращает размер коллекции
    - `get(int index)` возвращает элемент под индексом
*/
public class MyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int listSize = 0;
    public boolean add(T data){
        Node<T> tempCurrentNode = this.last;
        Node<T> newNode = new Node(tempCurrentNode, null, data);
        this.last = newNode;
        if(first == null){
            this.first = newNode;
        }else{
            tempCurrentNode.next = newNode;
        }
        this.listSize++;
        return true;
    }
    public T remove(int index){
        Node<T> current = this.findNodeByIndex(index);
        T data = current.data;
        Node<T> tempPrev = current.prev != null ? current.prev : null;
        Node<T> tempNext = current.next != null ? current.next : null;
        if(tempPrev != null){
            tempPrev.next = tempNext;
        }
        if(tempNext != null){
            tempNext.prev = tempPrev;
        }
        this.listSize--;
        return data;
    }
    public void clear(){
        Node<T> current = this.first;
        while (current != null){
            Node<T> next = current.next;
            current.data = null;
            current.prev = null;
            current.next = null;
            current = next;
        }
        this.first = this.last = null;
        this.listSize = 0;
    }
    public int size(){
        return this.listSize;
    }
    public T get(int index) {
        return this.findNodeByIndex(index).data;
    }
    private Node<T> findNodeByIndex(int index) throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size()){
            throw new IndexOutOfBoundsException();
        }
        return this.listSize / 2 < index ? this.searchNodeFromStart(index) : this.searchNodeFromEnd(index);
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
    private Node<T> searchNodeFromEnd(int index){
        Node<T> current = this.last;
        int tempIndex = this.listSize;
        while(current.hasPrev()){
            if(index == tempIndex){
                break;
            }
            current = current.prev;
            tempIndex--;
        }
        return current;
    }
    @Override
    public String toString() {
        if(this.listSize == 0){
            return "List is empty";
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
    public String outputReverse() {
        if(this.listSize == 0){
            return "List is empty";
        }
        Node<T> current = last;
        StringBuilder builder = new StringBuilder();
        while(current != null){
            Node<T> prev = current.prev;
            builder.append("\"").append(current.data).append(current.prev != null ? "\", " : "\"");
            current = prev;
        }
        return "[" + builder + "]";
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