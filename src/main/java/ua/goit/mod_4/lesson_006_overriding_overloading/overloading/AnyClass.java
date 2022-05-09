package ua.goit.mod_4.lesson_006_overriding_overloading.overloading;

public class AnyClass {
    public String text(){
        return "Hello";
    }

    public String text(String name){
        return "Hello "+name;
    }

    public String text(String name, int age){
        return "Hello " + name + " Age: " + age;
    }

//    public void text(String name, int age){ // Error, same args !!!
//        System.out.println("Hello " + name + " Age: " + age);
//    }
}
