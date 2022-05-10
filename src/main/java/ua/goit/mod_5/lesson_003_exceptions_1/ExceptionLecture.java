package ua.goit.mod_5.lesson_003_exceptions_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

public class ExceptionLecture {
    public static void main(String[] args) {
//        try{
//            fileNotFound("fileName");
//        }catch(IOException ex_io){
//            ex_io.printStackTrace();
//        }catch(ClassNotFoundException ex_cnf){
//            ex_cnf.printStackTrace();
//        }

        try{
            fileNotFound("fileName");
        }catch(IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    private static void fileNotFound(String fileName) throws IOException, ClassNotFoundException {
        if (Objects.isNull(fileName)){
            throw new ClassNotFoundException();
        }
        throw new FileNotFoundException("File with name: " + fileName + " not found");
    }
}
