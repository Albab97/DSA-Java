package Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = scn.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of array : ");
        for (int i = 0; i < n; i++) {
            nums[i]=scn.nextInt();
        }
        rotateArrayRightByK(nums, 2);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    // Approach 1 : Space complexity : O(1) ; Time complexity : O(k*n)
    static void rotateArrayRightByK(int[] nums, int k){
        int n = nums.length;
        while(k>0){
            int temp = nums[n-1];
            for(int i = n-2; i >= 0; i--){
                nums[i+1]=nums[i];
            }
            nums[0]=temp;
            k--;
        }
    }
    // Approach 2 : Space complexity : O(n) ; Time complexity : O(n)
    static void rotateArrayRightByKOptimized(int[] nums, int k){
        int n = nums.length;
        int[] arr = new int[n];
        int i =0;
        if(k>=n) k=k%n;
        for(int j = n-k ; j<n ; j++){
            arr[i]=nums[j];
            i++;
        }
        for(int m = 0 ; m< n-k; m++){
            arr[i] = nums[m];
            i++;
        }
        for(int j = 0 ; j<n; j++){
            nums[j] = arr[j];
        }
    }

}
