package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BasicQues {
    public static void main(String[] args) {
        int size;
        Scanner scn = new Scanner(System.in);
        size = scn.nextInt();
        int[] nums=new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=scn.nextInt();
        }
//        System.out.println(largestElementOfArray(nums));
//        System.out.println(isArraySorted(nums));
//        System.out.println(secondLargestElementOfArray(nums));
//        System.out.println(linearSearch(nums,50));
        System.out.println(Arrays.toString(leftRotateBy1(nums)));
    }

//  Constraints:
//     1 <= nums.length <= 105
//     -104 <= nums[i] <= 104
//     nums may contain duplicate elements.
    static int largestElementOfArray(int[] nums){
        int maxElement=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxElement)
                maxElement = nums[i];
        }
        return maxElement;
    }
//    Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not. If the array is sorted then return True, Else return False.
//                       Note: Two consecutive equal values are considered to be sorted.
    static boolean isArraySorted(int[] nums){
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1])
                flag=false;
        }
        return flag;
    }
//    Problem Statement: Given an array, find the second largest element in the array.
//        Print ‘-1’ in the event that it does not exist.
    static int secondLargestElementOfArray(int[] nums){
        int max,smax;
        if(nums.length == 1) return -1;
        if(nums[0]>nums[1]){
            max=nums[0];
            smax=nums[1];
        }else {
            max=nums[1];
            smax=nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if(nums[i]>max){
                smax=max;
                max=nums[i];
            }else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return smax;
    }
//    Problem Statement: Given an array, and an element key the task is to find if key is present in the given array or not.
//                        If present print the index of the element or print -1.
    static int linearSearch(int[] nums, int key){
        for (int i = 0; i < nums.length ;i++) {
            if(nums[i]==key)
                return i;
        }
        return -1;
    }
    static int[] leftRotateBy1(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            // swap nums[i] and nums[i-1]
            int temp = nums[i-1];
            nums[i-1]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
}
