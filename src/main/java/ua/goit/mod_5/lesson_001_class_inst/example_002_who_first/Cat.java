package ua.goit.mod_5.lesson_001_class_inst.example_002_who_first;

public class Cat extends Animal {
    private String name;
    private String color;
    private static String catHouse;

    {
        System.out.println("005 Non-static block in Cat");
    }

    static{
        catHouse = "Kyiv";
        System.out.println("002 Static CHILD block (Cat)");
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("006 Cat constrctor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
