package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5); // dynamic array of variable size. We can add any no. of elements
        list.add(123);
        list.add(0);
        list.add(34);
        list.add(49);
        list.add(890);
        list.add(467);
        System.out.println(list);
        System.out.println(list.contains(579));

        list.set(0,99);
        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        //input
        for (int i = 0; i < 5; i++) {
            list.add(scn.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println(list);
    }
}
