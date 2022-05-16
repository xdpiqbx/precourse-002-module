package ua.goit.mod_008.HomeWork.MyLinkedList;

public class MyLinkedList_MAIN<T> {
    private Node listHeader; // *********************************************
    public void add(T data){
        Node<T> newNode = new Node<T>(data);
        if(this.listHeader == null){
            this.listHeader = newNode;
        }else{
            Node<T> currentNode = this.listHeader;
            while(currentNode.getNextNode() != null){
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(newNode);
        }
    }

    public void output() {
        if(this.listHeader != null){
            Node<T> currentNode = this.listHeader;
            while(currentNode.getNextNode() != null){
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNextNode();
            }
            System.out.println(currentNode.getData());
        }
    }

    public static class Node<T> {
        private T data;
        private Node<T> nextNode;
        private Node<T> prevNode;
        public Node(T data){
            this.data = data;
        }
        public T getData() {
            return this.data;
        }
        public void setData(T data) {
            this.data = data;
        }
        public Node<T> getNextNode() {
            return this.nextNode;
        }
        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }
        public Node<T> getPrevNode() {
            return this.prevNode;
        }
        public void setPrevNode(Node<T> nextNode) {
            this.prevNode = prevNode;
        }
    }

}
