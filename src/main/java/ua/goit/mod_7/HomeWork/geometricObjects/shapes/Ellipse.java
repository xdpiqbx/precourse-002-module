package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.Shape;

public class Ellipse implements Shape {
    private static final String type = "Quad";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
