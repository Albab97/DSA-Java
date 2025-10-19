package Arrays;

import java.util.Scanner;

public class SubarrayQues {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = scn.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the Array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
//        System.out.println(maximumSubarraySum(nums));
        printSubarrayWithMaxSum(nums);
    }
    // Kadane's algo
    static int maximumSubarraySum(int[] nums){
        int sum = nums[0];
        int maxSum = sum;
        for (int i = 1; i < nums.length; i++) {
            if (sum+nums[i] <= nums[i])
                sum = nums[i];
            else
                sum = sum + nums[i];
            maxSum = (sum > maxSum) ? sum : maxSum;
        }
        return maxSum;
    }
    static void printSubarrayWithMaxSum(int[] nums){
        int sum = nums[0];
        int maxSum = sum;
        int start = 0, end = 0;
        for (int i = 1; i < nums.length; i++) {
            if (sum+nums[i] <= nums[i]) {
                sum = nums[i];
                start = i;
            }
            else {
                sum = sum + nums[i];
            }
            if(maxSum < sum ){
                maxSum = sum;
                end = i;
            }
        }
        //printing the Subarray
        System.out.print("[ ");
        for (int i = start; i <= end; i++) {
            if(i!=end)
                System.out.print(nums[i]+", ");
            else
                System.out.print(nums[i]);
        }
        System.out.print(" ]");
    }

}
