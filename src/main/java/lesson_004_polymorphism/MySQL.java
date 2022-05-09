package main.java.lesson_004_polymorphism;

public class MySQL extends Database {
    public void connection(){
        System.out.println("Connected to MySQL!");
    }
    public void select(){
        System.out.println("Select * FROM MySQL");
    }
}
