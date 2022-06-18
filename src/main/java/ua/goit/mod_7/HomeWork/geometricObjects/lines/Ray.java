package ua.goit.mod_7.HomeWork.geometricObjects.lines;

import ua.goit.mod_7.HomeWork.Shape;

public class Ray implements Shape {
    private static final String type = "Line";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
