package ua.goit.mod_7.HomeWork;

import ua.goit.mod_7.HomeWork.geometricObjects.shapes.Circle;
import ua.goit.mod_7.HomeWork.geometricObjects.shapes.Ellipse;
import ua.goit.mod_7.HomeWork.geometricObjects.lines.Ray;
import ua.goit.mod_7.HomeWork.geometricObjects.shapes.Rectangle;
import ua.goit.mod_7.HomeWork.geometricObjects.lines.Segment;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Figure(new Circle());
        Figure figure2 = new Figure(new Ray());
        Figure figure3 = new Figure(new Ellipse());
        Figure figure4 = new Figure(new Rectangle());
        Figure figure5 = new Figure(new Segment());

        System.out.println(figure1);
        System.out.println(figure2);
        System.out.println(figure3);
        System.out.println(figure4);
        System.out.println(figure5);
    }
}
