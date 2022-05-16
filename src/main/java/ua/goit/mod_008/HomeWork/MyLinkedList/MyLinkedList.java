package ua.goit.mod_008.HomeWork.MyLinkedList;

public class MyLinkedList<T> {
    private Node<T> listHeader; // *********************************************
    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(this.listHeader == null){
            this.listHeader = newNode;
        }else{
            Node<T> currentNode = this.listHeader;
            while(currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.nextNode = newNode;
        }
    }

    public void output() {
        if(this.listHeader != null){
            Node<T> currentNode = this.listHeader;
            while(currentNode.nextNode != null){
                System.out.println(currentNode.data);
                currentNode = currentNode.nextNode;
            }
            System.out.println(currentNode.data);
        }
    }

    public static class Node<T> {
        public T data;
        public Node<T> nextNode;
        public Node(T data){
            this.data = data;
        }
    }

}
