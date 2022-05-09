package ua.goit.mod_4.lesson_004_polymorphism;

public class PostgreSQL extends Database {
    public void connection(){
        System.out.println("Connected to PostgreSQL!");
    }
    public void select(){
        System.out.println("Select * FROM PostgreSQL");
    }
}
