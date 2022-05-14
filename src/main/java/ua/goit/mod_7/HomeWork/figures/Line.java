package ua.goit.mod_7.HomeWork.figures;

import ua.goit.mod_7.HomeWork.Shape;

public class Line implements Shape {
    private static final String type = "Line";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
