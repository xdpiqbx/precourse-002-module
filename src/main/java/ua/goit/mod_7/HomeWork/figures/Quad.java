package ua.goit.mod_7.HomeWork.figures;

import ua.goit.mod_7.HomeWork.Shape;

public class Quad implements Shape {
    private static final String type = "Quad";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}