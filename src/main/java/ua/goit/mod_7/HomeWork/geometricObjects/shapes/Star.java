package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.abstracts.Shape;

public class Star extends Shape {
    private static final String type = "Star";
    @Override
    public String getFigureTitle(){
        return this.type;
    }
}
