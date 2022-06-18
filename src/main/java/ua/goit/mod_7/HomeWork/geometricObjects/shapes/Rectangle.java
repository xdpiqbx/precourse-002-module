package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.Shape;

public class Rectangle implements Shape {
    private static final String type = "Rect";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
