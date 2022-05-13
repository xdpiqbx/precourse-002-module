package ua.goit.mod_7.lesson_001_Interfaces.interfaceExample;

public interface Car {
    static final int NUMBER_OF_WHEELS = 4;
    void drive();
    int horsePower();
    default int getNumberOfWheels(){
        return NUMBER_OF_WHEELS;
    }
}
