package neuefische;

import java.util.Arrays;

public class Sack <T>{
    private GenericsArray<T> array = new GenericsArray<>(8);

    public void addElement(T element){
        for (int i = 0; i < array.getLength(); i++) {
            if(array.getElement(i) == null){
                array.setElement(i, element);
                break;
            }
            if(i == array.getLength() - 2){
                changeLength();
            }
        }
    }

    public int getSize(){
        int size = 0;
        for (int i = 0; i < array.getLength(); i++) {
            if(array.getElement(i) != null) size++;
        }
        return size;
    }

    public void printElements(){
        GenericsArray<T> arrayToPrint = new GenericsArray<>(getSize());
        for (int i = 0; i < arrayToPrint.getLength(); i++) {
            arrayToPrint.setElement(i, array.getElement(i));
        }
        System.out.println(arrayToPrint);
    }
    private void changeLength(){
        GenericsArray<T> newArray = new GenericsArray<>(array.getLength() * 2);
        for (int i = 0; i < array.getLength(); i++) {
            newArray.setElement(i, array.getElement(i));
        }
        array = newArray;
    }

    public void removeLast(){
        for (int i = array.getLength() - 1; i > 0; i--){
            if(array.getElement(i) != null){
                array.setElement(i,null);
                break;
            }
        }
    }

    public void removeByIndex(int index){
        array.setElement(index, null);
        for (int i = index; i < getSize(); i++) {
            array.setElement(i, array.getElement(i+1));
            if(i == getSize()) break;
        }
    }

    public void addByIndex(int index, T element){
        GenericsArray<T> secondArray = new GenericsArray<>(array.getLength() + 1);
        for (int i = 0; i < secondArray.getLength(); i++) {
            if(i < index){
                secondArray.setElement(i, getElement(i));
                continue;
            }
            if(i == index){
                secondArray.setElement(i,element);
            }
            if(i > index){
                secondArray.setElement(i, array.getElement(i-1));
            }
        }
        array = secondArray;
    }

    public T getElement(int index){
        return array.getElement(index);
    }
}
