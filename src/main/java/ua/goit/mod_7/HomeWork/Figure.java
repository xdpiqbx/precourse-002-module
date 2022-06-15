package ua.goit.mod_7.HomeWork;

public class Figure{
    private Shape figure;
    public Figure(Shape figure){
        this.figure = figure;
    }
    @Override
    public String toString() {
        return this.figure.getFigureTitle();
    }
}
