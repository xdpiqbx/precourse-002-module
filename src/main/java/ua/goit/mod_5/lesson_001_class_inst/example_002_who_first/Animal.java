package ua.goit.mod_5.lesson_001_class_inst.example_002_who_first;

public class Animal {
    {
        System.out.println("003 Non-static parent block");
    }

    static {
        System.out.println("001 Static parent block (Animal)");
    }

    Animal(){
        System.out.println("004 Animal constructor");
    }
}
