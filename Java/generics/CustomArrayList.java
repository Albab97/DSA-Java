package generics;

import properties.access.A;
import properties.interfaces.nestedInterfaces.C;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
           this.resize();
        }
        data[size++] = num;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        //copy the items to the new array
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data=temp;
    }
    private boolean isFull(){
        return size == data.length;
    }
    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int value){
        data[index]=value;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.remove(0);
        list1.add(4);
        list1.size();
        CustomArrayList list = new CustomArrayList();
//        list.add(3);
//        list.add(9);
//        list.add(1);
//        System.out.println(list);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
    }

}
