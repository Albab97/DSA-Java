package Arrays;

import java.util.Scanner;

//Problem Statement: Given an array, print all the elements which are leaders.
//A Leader is an element that is greater than all of the elements on its right side in the array.
//Example 1:
//Input:
//arr = [4, 7, 1, 0]
//Output:
//7 1 0
//Example 2:
//Input:
//arr = [10, 22, 12, 3, 0, 6]
//Output:
// 22 12 6

public class leadersProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        printLeadersInAnArray(arr);
    }
    static void printLeadersInAnArray(int[] arr){
        if (arr.length==0) return;
        int leader = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] >= leader) {
                leader = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
