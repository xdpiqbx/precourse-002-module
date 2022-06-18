package ua.goit.mod_7.HomeWork.geometricObjects.lines;

import ua.goit.mod_7.HomeWork.abstracts.Line;

public class Segment extends Line {
    private static final String type = "Segment";
    public void getFigureTitle(){
        System.out.println(this.type);
    }
}
