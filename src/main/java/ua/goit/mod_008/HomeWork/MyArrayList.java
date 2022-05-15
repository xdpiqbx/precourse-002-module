package ua.goit.mod_008.HomeWork;

import java.util.Arrays;

public class MyArrayList<T> {

    private T[] array = (T[]) new Object[0];
    public MyArrayList(){

    }
    public boolean add(T item){
        try{
            this.array = Arrays.copyOf(this.array, this.array.length + 1);
            this.array[array.length - 1] = item;
            return true;
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
    }
}
