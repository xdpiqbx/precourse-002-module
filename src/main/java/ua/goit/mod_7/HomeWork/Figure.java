package ua.goit.mod_7.HomeWork;

public class Figure implements Shape {
    private Shape figure;
    public Figure(Shape figure){
        this.figure = figure;
    }
    @Override
    public String getFigureTitle() {
        return this.figure.getFigureTitle();
    }
}
