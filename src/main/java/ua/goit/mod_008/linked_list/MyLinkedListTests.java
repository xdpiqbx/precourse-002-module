package ua.goit.mod_008.linked_list;

public class MyLinkedListTests {
    public static void main(String[] args) {
        MyLinkedList <String> list = new MyLinkedList<>();
        System.out.println("list.size() = " + list.size());
        list.add("Alpha");
        list.add("Omega");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(0) = " + list.get(1));
    }
}
