package BinarySearch;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] res = searchRange(nums,target);
        System.out.println("{"+res[0]+","+res[1]+"}");
    }
    // Leetcode 34
    static int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        // find first position of target
        int start = 0, end = nums.length-1;
        int firstPosition = 0;
        while(start<=end){
            firstPosition = (start+end)/2;
            if(target == nums[firstPosition]){
                res[0]=firstPosition;
                end = firstPosition-1;
            }else if (target < nums[firstPosition]){
                end = firstPosition-1;
            }else{
                start = firstPosition+1;
            }
        }
        // find last position of target
        start = firstPosition;
        end = nums.length-1;
        int lastPosition = start;
        while(start<=end){
            lastPosition = (start+end)/2;
            if(target == nums[lastPosition]){
                res[1]=lastPosition;
                start = lastPosition+1;
            }else if (target < nums[lastPosition]){
                end = lastPosition-1;
            }else{
                start = lastPosition+1;
            }
        }
        return res;
    }
}
