package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.abstracts.Shape;

public class Circle extends Shape {
    private static final String type = "Circle";
    @Override
    public String getFigureTitle(){
        return this.type;
    }
}
