package ua.goit.mod_7.HomeWork.geometricObjects.lines;

import ua.goit.mod_7.HomeWork.Shape;

public class Segment implements Shape {
    private static final String type = "Triangle";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
