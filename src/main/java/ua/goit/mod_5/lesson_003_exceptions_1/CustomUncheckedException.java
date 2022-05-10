package ua.goit.mod_5.lesson_003_exceptions_1;

public class CustomUncheckedException extends RuntimeException{
    public CustomUncheckedException (String message){
        super(message);
    }
}
