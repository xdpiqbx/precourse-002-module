package ua.goit.mod_7.HomeWork.figures;

import ua.goit.mod_7.HomeWork.Shape;

public class Triangle implements Shape {
    private static final String type = "Triangle";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
