package ua.goit.mod_4.lesson_003_inheritance;

public class Cat extends Animal{
    public void eat(){
        super.eat();
        System.out.println("Cat eating ...");
    }
}
