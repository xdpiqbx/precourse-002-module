package ua.goit.mod_5.lesson_003_exceptions_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class ExceptionLecture_002 {
    public static void main(String[] args) {
        try{
            checkForInt("12");
        }catch(CustomUncheckedException exc){
            System.out.println("You pass wrong data");
        }
    }
    private static void checkForInt(Object obj){
        if (obj instanceof Integer){
            System.out.println((Integer) obj);
        } else {
            throw new CustomUncheckedException("obj should instanceof Integer");
        }
    }
}
