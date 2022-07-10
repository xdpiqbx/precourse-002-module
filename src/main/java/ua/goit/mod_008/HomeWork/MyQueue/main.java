package ua.goit.mod_008.HomeWork.MyQueue;

public class main {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();

        myQueue.add("My Queue 001");
        myQueue.add("My Queue 002");
        myQueue.add("My Queue 003");
        myQueue.add("My Queue 004");
        myQueue.add("My Queue 005");

        System.out.println(myQueue);

        System.out.println("\r\n=== .remove() ===");
        System.out.println("Removed: \"" + myQueue.remove()+"\"");

        System.out.println("\r\n=== .size() ===");
        System.out.println("Queue size: " + myQueue.size());

        System.out.println("\r\n=== .peek() ===");
        System.out.println("peek: \"" + myQueue.peek() + "\"");

        System.out.println("\r\n=== .poll() ===");
        System.out.println("poll: \"" + myQueue.poll() + "\"");

        System.out.println("\r\n=== .clear() ===");
        myQueue.clear();

        System.out.println(myQueue);

        System.out.println("\r\n=== .peek() after .clear() ===");
        System.out.println("peek: \"" + myQueue.peek() + "\"");

        System.out.println("\r\n=== .poll() after .clear() ===");
        System.out.println("poll: \"" + myQueue.poll() + "\"");

        System.out.println("\r\n=== .remove() after .clear() ===");
        System.out.println("Removed: \"" + myQueue.remove()+"\"");
    }
}
