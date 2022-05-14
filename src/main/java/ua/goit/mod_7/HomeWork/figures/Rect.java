package ua.goit.mod_7.HomeWork.figures;

import ua.goit.mod_7.HomeWork.Shape;

public class Rect implements Shape {
    private static final String type = "Rect";

    @Override
    public String getFigureTitle() {
        return this.type;
    }
}
