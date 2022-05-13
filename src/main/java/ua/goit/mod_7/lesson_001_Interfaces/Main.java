package ua.goit.mod_7.lesson_001_Interfaces;

import ua.goit.mod_7.lesson_001_Interfaces.abstractExample.Animal;
import ua.goit.mod_7.lesson_001_Interfaces.abstractExample.Dog;
import ua.goit.mod_7.lesson_001_Interfaces.interfaceExample.Car;
import ua.goit.mod_7.lesson_001_Interfaces.interfaceExample.Mercedes;

public class Main {
    public static void main(String[] args) {
        Car car = new Mercedes();
        car.drive();

        Animal dog  = new Dog();
        dog.animalSound();
    }
}
