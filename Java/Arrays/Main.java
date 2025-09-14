package Arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Array is needed when we are storing more number of same type of data.
        //Syntax
        int[] rnos = new int[5];
        //or directly
//        int[] rnos = {3,4,5,6,7,8};

        int[] ros ; // declaration of an array, ros getting defined in the stack
        ros = new int[5]; // initialization : actually here object is being created in the (heap) memory.

        System.out.println(ros[1]); // without initialization each item is array is 0.

        String[] arr = new String[4];
        System.out.println(arr[2]); //each element by default null , special literal which can't be assigned to any primitive datatype. It's only for reference datatype/variable.

        //Input
        Scanner scn = new Scanner(System.in);
        int[] arr1 = new int[5];
        arr1[0] = 23;
        arr1[1] = 32;
        arr1[2] = 89;
        arr1[3] = 123;
        arr1[4] = 56;
//        System.out.println(arr1[3]);

        //using for loops;
//        for (int i = 0; i < arr1.length; i++) {
//            arr1[i]=scn.nextInt();
//        }
//        // different ways to print
//        for (int num : arr1){   // for each loop
//            System.out.print(num+ " "); // num represents each element of arr1
//        }
//         // using Arrays class
//        System.out.println(Arrays.toString(arr1));

        //modify

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scn.next();
        }
        System.out.println(Arrays.toString(str));

        str[1]="hey";

        System.out.println(Arrays.toString(str));

    }
}
