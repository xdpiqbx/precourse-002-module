package ua.goit.mod_7.lesson_001_Interfaces.abstractExample;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        sleep();
        System.out.println("Woof !!!");
    }
}
