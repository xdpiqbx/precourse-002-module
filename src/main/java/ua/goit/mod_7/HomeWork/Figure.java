package ua.goit.mod_7.HomeWork;

public class Figure implements Shape {
    private Shape figureTitle;
    public Figure(Shape figure){
        this.figureTitle = figure;
    }
    public void printFigureTitle(){
        System.out.println(this.figureTitle);
    }

    @Override
    public String getFigureTitle() {
        return this.figureTitle.getFigureTitle();
    }
}
