package ua.goit.mod_4.lesson_004_polymorphism;

public class Polymorphism {
    public static void main(String[] args) {
        Database db = new PostgreSQL(); // Polymorphism !
        db.connection();
        db.select();
    }
}
