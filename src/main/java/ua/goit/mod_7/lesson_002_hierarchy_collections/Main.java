package ua.goit.mod_7.lesson_002_hierarchy_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        {
            Collection collection = new ArrayList();
            collection.add(42);
            collection.add(42d);
            collection.add("String");
        }
        {
            Collection<String> collection = new ArrayList<String>();
            // collection.add(42); // error
            collection.add("first");
            collection.add("second");
            collection.add("third");
            System.out.println("Size before clearing: " + collection.size());
            print(collection);
            System.out.println("Size after clearing: " + collection.size());
        }
    }
//    private static void print(Collection<String> collection){
//        Iterator<String> iterator = collection.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//    }
//    private static void print(Collection<String> collection){
//        for (String str: collection) {
//            System.out.println(str);
//            // collection.remove(str); // error !!!
//        }
//    }
    private static void print(Collection<String> collection){
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove(); // it is OK=)
        }
    }
}
