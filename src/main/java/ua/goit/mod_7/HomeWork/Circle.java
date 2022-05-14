package ua.goit.mod_7.HomeWork;

public class Circle implements Shape {
    private static final String type = "Circle";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
