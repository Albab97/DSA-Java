package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,109};
        int target = 22;
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    //return the index
    //return -1 if it does not exists
    static int binarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
//            int mid = (start + end) / 2;  might be possible that (start+end) will exceed the int range. So a better way to write mid is below.
            int mid = start + (end-start)/2;
            if (target == arr[mid])
                return mid;
            else if (target > arr[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
