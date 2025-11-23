package BinarySearch;

public class CeilingAndFloorElement {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
//        int result = floorElement(arr,target);
//        System.out.println(result);
        char[] letters = {'c','f','j'};
        char key = 'a';
        System.out.println(nextGreatestLetter(letters,key));
    }
//    Problem Statement: You're given an sorted array arr of n integers and an integer x. Find the floor and ceiling of x in arr[0..n-1].
//    The floor of x is the largest element in the array which is smaller than or equal to x. The ceiling of x is the smallest element in the array greater than or equal to x.
    static int ceilElement(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        if(target > arr[end]) return -1;
        while (start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return arr[mid];
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[start];
    }
    static int floorElement(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        if(target < arr[start]) return -1;
        while (start <= end){
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return arr[mid];
            }else if(target<arr[mid]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return arr[end];
    }
    // Leetcode 744
    static char nextGreatestLetter(char[] letters, char key){
        int start = 0, end = letters.length-1;
        if(key>=letters[end]) return letters[start];
        while (start<=end){
            int mid = (start+end)/2;
            if(key>=letters[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return letters[start];
    }
}
