package ua.goit.mod_009.lesson_005_generics;

public class GenericType_001<T> {
    private T type;
    public T get(){
        return this.type;
    }
    public void set(T type){
        this.type = type;
    }
}
