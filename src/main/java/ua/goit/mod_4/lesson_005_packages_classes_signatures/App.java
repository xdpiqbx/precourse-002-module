package ua.goit.mod_4.lesson_005_packages_classes_signatures;

public class App {
    public static void main(String[] args) {
        Printer printer = new Printer("white", "HP", 30, 100);
        System.out.println(printer.getPaintVolume());
    }
}
