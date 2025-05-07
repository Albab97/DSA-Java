package generics;

import properties.polymorphism.Numbers;

import java.util.Arrays;
import java.util.List;

public class WildcardExample<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index

    public WildcardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
           this.resize();
        }
        data[size++] = num;
    }

    public void getList(List<? extends Number> list){ // now here we can pass List of type class Number or subclass of Number. This is called Wildcard.
        // do something
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        //copy the items to the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data=temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }
    public T get(int index){
        return (T) data[index];
    }
    public void set(int index, int value){
        data[index]=value;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "WildcardExample{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample<Integer> list = new WildcardExample<>();
//        list.add(3);
//        list.add(9);
//        list.add(1);
//        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

//        WildcardExample<String> list2= new WildcardExample<>(); // This shows error because we have restricted our generic class T to be of Number or either be a subclass of Number like Integer/Float.
//        list2.add("ABC");
    }

}
