package ua.goit.mod_009.lesson_005_generics;

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

        //*****************************************************
        System.out.println("\n\rGenericType<Integer> genericType = new GenericType<>()");
        GenericType_001<Integer> genericType = new GenericType_001<>();
        genericType.set(100);

        GenericType_001<String> genericTypeStr = new GenericType_001<>();
        genericTypeStr.set("200");

//        System.out.println(
//            "Is equeals generic types? - " +
//            GenericUtils.isEquals(genericType, genericTypeStr)
//        );
    }
}
