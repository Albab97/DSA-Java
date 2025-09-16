package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int[][] arr = new int[3][];
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //input
//        int[][] nums = new int[3][2];
//        for (int row = 0; row < nums.length; row++) {
//            for (int col = 0; col < nums[row].length; col++) {
//                nums[row][col] = scn.nextInt();
//            }
//        }
        //output
//        for (int row = 0; row < nums.length; row++) {
//            System.out.print("[ ");
//            for (int col = 0; col < nums[row].length; col++) {
//                System.out.print(nums[row][col]+ " ");
//            }
//            System.out.print("]");
//            System.out.println();
//        }
        //alternate way of output
//        for (int row = 0; row < nums.length; row++) {
//            System.out.println(Arrays.toString(nums[row]));
//        }

        //Dynamic array
        // For 2D array it is mandatory to mention the size of no. of rows but not mandatory to mention the columns because each row can have different no. of columns.
        int[][] darr = {
                {2,5,7},
                {1,9},
                {5}
        };
        for (int row = 0; row < darr.length; row++) {
            System.out.println(Arrays.toString(darr[row]));
        }

    }
}
