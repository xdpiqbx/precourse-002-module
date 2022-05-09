package ua.goit.mod_4.lesson_005_packages_classes_signatures;

public class Printer {
    private String printerColor;
    private String mark;
    private double printSpeed;
    private double paintVolume;

    public Printer(String printerColor, String mark, double printSpeed, double paintVolume){
        this.printerColor = printerColor;
        this.mark = mark;
        this.printSpeed = printSpeed;
        this.paintVolume = paintVolume;
    }

    public String getPrinterColor() {
        return printerColor;
    }

    public void setPrinterColor(String printerColor) {
        this.printerColor = printerColor;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getPrintSpeed() {
        return printSpeed;
    }

    public void setPrintSpeed(double printSpeed) {
        this.printSpeed = printSpeed;
    }

    public double getPaintVolume() {
        return paintVolume;
    }

    public void setPaintVolume(double paintVolume) {
        this.paintVolume = paintVolume;
    }
}
