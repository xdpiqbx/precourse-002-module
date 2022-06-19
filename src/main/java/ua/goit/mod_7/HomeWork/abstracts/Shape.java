package ua.goit.mod_7.HomeWork.abstracts;

import ua.goit.mod_7.HomeWork.interfaces.GeometricObject;

public abstract class Shape implements GeometricObject {
    private static final String type = "Shape Abstract";
    public String getFigureTitle(){
        return this.type;
    }
}
