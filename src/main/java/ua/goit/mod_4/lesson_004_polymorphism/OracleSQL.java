package ua.goit.mod_4.lesson_004_polymorphism;

public class OracleSQL extends Database {
    public void connection(){
        System.out.println("Connected to OracleSQL!");
    }
    public void select(){
        System.out.println("Select * FROM OracleSQL");
    }
}
