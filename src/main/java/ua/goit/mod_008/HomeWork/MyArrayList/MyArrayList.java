package ua.goit.mod_008.HomeWork.MyArrayList;

import java.util.Arrays;

public class MyArrayList<T> {
    private T[] array = (T[]) new Object[0];
    public boolean add(T item){
        try{
            this.array = Arrays.copyOf(this.array, this.array.length + 1);
            this.array[this.array.length - 1] = item;
            return true;
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            return false;
        }
    }
    public T remove(int index){
        T removable = this.array[index];
        int arrLength = this.array.length;
        int counter = 0;
        for (int i = 0; i < arrLength; i++) {
            if(index == i){
                continue;
            }
            this.array[counter] = this.array[i];
            counter++;
        }
        this.array = Arrays.copyOf(this.array, this.array.length-1);
        return removable;
    }
    public void clear(){
        this.array = Arrays.copyOf(this.array, 0);
    }
    public int size(){
        return this.array.length;
    }
    public T get(int index){
        return this.array[index];
    }
    @Override
    public String toString() {
        return Arrays.toString(this.array);
    }
}
