package ua.goit.mod_008.HomeWork.MyStack;

public class main {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        myStack.push("My Stack 001");
        myStack.push("My Stack 002");
        myStack.push("My Stack 003");
        myStack.push("My Stack 004");
        myStack.push("My Stack 005");
        System.out.println("\n\r"+myStack);

        int index = 2;
        System.out.printf("%n=== .remove(%d) by index ===%n", index);
        System.out.println("Removed - " + myStack.remove(index));
        System.out.println(myStack);

        System.out.println("\n\r=== .size() by index ===");
        System.out.println("Size of stack: " + myStack.size());

        System.out.println("\n\r=== .peak() ===");
        System.out.println(myStack.peak());
        System.out.println(myStack);

        System.out.println("\n\r=== .pop() ===");
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack); // Stack is empty
//        System.out.println(myStack.pop()); // Exception in thread "main" java.util.EmptyStackException

        System.out.println("\n\r=== .clear() ===");
        myStack.clear();
        System.out.println(myStack);
    }
}
