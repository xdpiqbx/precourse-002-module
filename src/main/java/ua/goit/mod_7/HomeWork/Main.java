package ua.goit.mod_7.HomeWork;

import ua.goit.mod_7.HomeWork.figures.Circle;
import ua.goit.mod_7.HomeWork.figures.Quad;
import ua.goit.mod_7.HomeWork.figures.Line;
import ua.goit.mod_7.HomeWork.figures.Rect;
import ua.goit.mod_7.HomeWork.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure figure1 = new Figure(new Circle());
        Figure figure2 = new Figure(new Line());
        Figure figure3 = new Figure(new Quad());
        Figure figure4 = new Figure(new Rect());
        Figure figure5 = new Figure(new Triangle());

        System.out.println(figure1);
        System.out.println(figure2);
        System.out.println(figure3);
        System.out.println(figure4);
        System.out.println(figure5);
    }
}
