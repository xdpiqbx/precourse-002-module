package ua.goit.mod_7.HomeWork;

import ua.goit.mod_7.HomeWork.figures.Circle;
import ua.goit.mod_7.HomeWork.figures.Quad;
import ua.goit.mod_7.HomeWork.figures.Line;
import ua.goit.mod_7.HomeWork.figures.Rect;
import ua.goit.mod_7.HomeWork.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Shape figure = new Figure(new Circle());
        System.out.println(figure.getFigureTitle());
    }
}
