package generics;

import properties.interfaces.nestedInterfaces.C;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
           this.resize();
        }
        data[size++] = num;
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
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(9);
//        list.add(1);
//        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);

        CustomGenArrayList<String> list2 = new CustomGenArrayList<>();
        list2.add("Tata");
        list2.add("Jio");
        list2.add("Tesla");
        System.out.println(list2);
    }

}
