package ua.goit.mod_7.HomeWork;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Quad();
        Shape figure = new Figure(shape);
        System.out.println(figure.getFigureTitle());
    }
}
