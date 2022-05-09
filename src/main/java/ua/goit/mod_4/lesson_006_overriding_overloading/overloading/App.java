package ua.goit.mod_4.lesson_006_overriding_overloading.overloading;

public class App {
    public static void main(String[] args) {
        AnyClass anyObj = new AnyClass();
        System.out.println(anyObj.text());
        System.out.println(anyObj.text("Bill"));
        System.out.println(anyObj.text("John", 25));
    }
}
