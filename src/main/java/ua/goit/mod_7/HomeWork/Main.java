package ua.goit.mod_7.HomeWork;

import ua.goit.mod_7.HomeWork.geometricObjects.Point;
import ua.goit.mod_7.HomeWork.geometricObjects.shapes.*;
import ua.goit.mod_7.HomeWork.geometricObjects.lines.*;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Figure(new Circle());
        Figure figure2 = new Figure(new Ellipse());
        Figure figure3 = new Figure(new Rectangle());
        Figure figure4 = new Figure(new Polygon());
        Figure figure5 = new Figure(new Star());
        Figure figure6 = new Figure(new Ray());
        Figure figure7 = new Figure(new Segment());
        Figure figure8 = new Figure(new Point());
    }
}
