package ua.goit.mod_7.HomeWork.geometricObjects.lines;

import ua.goit.mod_7.HomeWork.abstracts.Line;

public class Ray extends Line {
    private static final String type = "Ray";
    public void getFigureTitle(){
        System.out.println(this.type);
    }
}
