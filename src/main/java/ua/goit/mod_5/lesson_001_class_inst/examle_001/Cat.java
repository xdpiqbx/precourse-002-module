package ua.goit.mod_5.lesson_001_class_inst.examle_001;

public class Cat extends Animal {
    private String name;
    private String color;

    public Cat(String gender){
        super(gender);
    }
    public Cat(String name, String color, String gender) {
        this(gender);
        this.name = name;
        this.color = color;
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
