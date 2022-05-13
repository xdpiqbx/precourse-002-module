package ua.goit.mod_7.lesson_001_Interfaces.interfaceExample;

public class Mercedes implements Car{
    @Override
    public void drive() {
        System.out.println("Comfort drive");
    }

    @Override
    public int horsePower() {
        return 300;
    }
}
