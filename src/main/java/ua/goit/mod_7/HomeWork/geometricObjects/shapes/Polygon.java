package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.abstracts.Shape;

public class Polygon extends Shape {
    private static final String type = "Polygon";
    @Override
    public void getFigureTitle(){
        System.out.println(this.type);
    }
}
