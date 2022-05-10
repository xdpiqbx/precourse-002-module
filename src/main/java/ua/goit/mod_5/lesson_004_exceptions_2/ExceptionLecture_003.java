package ua.goit.mod_5.lesson_004_exceptions_2;

import ua.goit.mod_5.lesson_003_exceptions_1.CustomUncheckedException;

public class ExceptionLecture_003 {
    public static void main(String[] args) {
        try{
            checkForInt("12");
        }catch(CustomUncheckedException exc){
            System.out.println("You pass wrong data");
        }finally{
            System.out.println("finally");
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
