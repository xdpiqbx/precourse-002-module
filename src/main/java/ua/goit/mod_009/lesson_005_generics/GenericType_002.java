package ua.goit.mod_009.lesson_005_generics;

public class GenericType_002<T extends Number> {
    private T type;
    public T get(){
        return this.type;
    }
    public void set(T type){
        this.type = type;
    }
}
