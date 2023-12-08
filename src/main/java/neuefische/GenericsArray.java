package neuefische;

import java.util.Arrays;

public class GenericsArray <T> {
    private T[] array;

    public GenericsArray(int size){
        array = (T[]) new Object[size];
    }
    public T getElement(int index){
        return array[index];
    }
    public void setElement(int index, T value){
        array[index] = value;
    }
    public int getLength(){
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
