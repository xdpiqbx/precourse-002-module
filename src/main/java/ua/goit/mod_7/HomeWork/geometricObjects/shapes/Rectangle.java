package ua.goit.mod_7.HomeWork.geometricObjects.shapes;

import ua.goit.mod_7.HomeWork.abstracts.Shape;

public class Rectangle extends Shape {
    private static final String type = "Rectangle";
    @Override
    public void getFigureTitle(){
        System.out.println(this.type);
    }
}
