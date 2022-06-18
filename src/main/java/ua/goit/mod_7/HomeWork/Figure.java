package ua.goit.mod_7.HomeWork;

import ua.goit.mod_7.HomeWork.interfaces.GeometricObject;

public class Figure{
    Figure(GeometricObject obj){
        if (obj instanceof GeometricObject){
            obj.getFigureTitle();
        }
    }
}
