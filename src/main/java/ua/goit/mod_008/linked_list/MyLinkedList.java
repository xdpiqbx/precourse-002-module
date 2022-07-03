package ua.goit.mod_008.linked_list;

public class MyLinkedList<T> {
    private Node<T> head;
    private int size = 0;
    public void add(T item){
        Node<T> node = new Node<>();
        node.setValue(item);
        this.size++;
        if(this.head == null){
            head = node;
            return;
        }
        Node<T> last = head;
        while(last.getNext() != null){
            last = last.getNext();
        }
        last.setNext(node);
    }

    public int size(){
        if(head == null){
            return 0;
        }
        return this.size;
    }

    public T get(int index){
        if(head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        if(index > this.size-1){
            throw new IndexOutOfBoundsException("Invalid index");
        }
        Node<T> search = head;
        int count = 0;
        while(search.getNext() != null){
            if (count == index){
                break;
            }
            search = search.getNext();
            count++;
        }
        return search.getValue();
    }
}
