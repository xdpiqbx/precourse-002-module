package ua.goit.mod_5.lesson_001_class_inst;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
    }
}

class Animal {
    private Integer paws = 4;
    public Animal(){
        System.out.println("Animal constructor");
        howManyPaws();
    }
    public void howManyPaws(){
        System.out.println(paws);
    }
}

class Cat extends Animal {
    private Integer paws = 4;
    public Cat(){
        System.out.println("Cat constructor");
        howManyPaws();
    }
    @Override
    public void howManyPaws(){
        System.out.println(paws);
    }
}