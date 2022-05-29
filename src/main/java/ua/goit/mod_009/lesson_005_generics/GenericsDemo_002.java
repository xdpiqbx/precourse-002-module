package ua.goit.mod_009.lesson_005_generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo_002 {
    public static void main(String[] args) {
        GenericTypeOld genericTypeOld = new GenericTypeOld();
        genericTypeOld.set(123);

        Object genericObject = genericTypeOld.get();
        if(genericObject instanceof String){
            String element = (String)genericTypeOld.get();
            System.out.println(element);
        }else if(genericObject instanceof Integer){
            Integer element = (Integer)genericObject;
            System.out.println(element);
        }else{
            System.err.println("Type is wrong");
        }
    }
}
