package ua.goit.mod_5.lesson_002_string;

import java.util.StringJoiner;

public class StringDemo {
    /*
        String:
        Immutable
        String Constant Pool
        StringBuilder
        StringBuffer
    */
    public static void main(String[] args) {
//        getStringFromPool();
//        createStringWithNewKeyword();
//        createStringWithNewKeywordAndIntern();
//        stringConcatenation();
//        substringExample();
//        replaceExample();
//        stringFormatExample();

//        System.out.println(reverseStringWithNewObject("Hello World"));
//        System.out.println(reverseStringWithoutAdditionalMemoryUsage("Hello World $$$"));

        System.out.println(stringBuilderReverseExample("String Builder Reverse Example"));

        System.out.println(stringBufferReverseExample("String BUFFER Reverse Example"));

    }
    private static void getStringFromPool(){
        String first = "Hello World";
        String second = "Hello World";
        System.out.println(first == second); // true (string pool, same link)
        System.out.println(first.equals(second)); // true
    }
    private static void createStringWithNewKeyword(){
        String first = "Hello World";
        String second = new String("Hello World");
        System.out.println(first == second); // false!
        System.out.println(first.equals(second)); // true
    }
    private static void createStringWithNewKeywordAndIntern(){
        String first = "Hello World";
        String second = new String("Hello World").intern(); // try get from pool
        System.out.println(first == second); // true
        System.out.println(first.equals(second)); // true
    }
    private static void stringConcatenation(){
        String first = "Hello";
        String hello = "Hel";
        String second = "lo";
        second = hello + second;
        System.out.println(first == second);
    }
    private static void substringExample(){
        String first = "Hello World";
        System.out.println(first.substring(1)); // ello World
        System.out.println(first.substring(1, 4)); // ell
        System.out.println(first.substring(1, first.length() - 1)); // ello Worl
    }
    private static void replaceExample(){
        String string = "Hello World";
        System.out.println(string.replace('l', '2'));
    }
    private static void stringFormatExample(){
        String formatted = String.format("Hello %s%s", "Hello", "World", "!");
        System.out.println(formatted);
    }
    public static void stringJoinerExxample(){
        String prefix = "[";
        String suffix = "]";
        StringJoiner joiner = new StringJoiner(",", prefix, suffix);
        String [] array = new String[]{"RED", "BLUE", "GREEN"};
        for (String color: array) {
            joiner.add(color);
        }
        System.out.println(joiner.toString());
    }
    public static String reverseStringWithNewObject(String input){
        char[] inputChar = input.toCharArray();
        char[] reversedChar = new char[inputChar.length];
        for (int i = 0; i < inputChar.length; i++) {
            reversedChar[i] = inputChar[inputChar.length - 1 - i];
        }
        return new String(reversedChar);
    }
    public static String reverseStringWithoutAdditionalMemoryUsage(String input){
        char[] inputArray = input.toCharArray();
        int begin = 0;
        int end = inputArray.length - 1;
        char temp;
        while(begin < end){
            temp = inputArray[begin];
            inputArray[begin] = inputArray[end];
            inputArray[end] = temp;
            ++begin;
            --end;
        }
        return new String(inputArray);
    }
    private static String stringBuilderReverseExample(String input){
        StringBuilder builder = new StringBuilder();
        return builder.append(input).reverse().toString();
    }
    private static String stringBufferReverseExample(String input){
        StringBuffer builder = new StringBuffer();
        return builder.append(input).reverse().toString();
    }
}
