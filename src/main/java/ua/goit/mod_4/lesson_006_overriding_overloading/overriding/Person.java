package ua.goit.mod_4.lesson_006_overriding_overloading.overriding;

public class Person {
    private int age;
    private String name;
    private String email;

    public Person(int age, String name, String email){
        this.age = age;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return
            "Name: " + name
            +"\nAge: " + age
            +"\nEmail: " + email;
    }
}
