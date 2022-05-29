package ua.goit.mod_009.lesson_005_generics;

public class GenericUtils {
    public static <T, V> boolean isEquals(GenericType_001<? super Number> o1, GenericType_001<V> o2){
        return o1.get().equals(o2.get());
    }
}
