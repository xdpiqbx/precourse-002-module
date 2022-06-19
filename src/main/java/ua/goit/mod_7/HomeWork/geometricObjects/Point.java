package ua.goit.mod_7.HomeWork.geometricObjects;

import ua.goit.mod_7.HomeWork.interfaces.GeometricObject;

public class Point implements GeometricObject {
    private static final String type = "Point";
    public String getFigureTitle(){
        return this.type;
    }
}
