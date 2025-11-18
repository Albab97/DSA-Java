package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {89,78,12,1,0,-90,-109};
        int target = -90;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAscending = arr[start] < arr[end];
        while (start <= end) {
//            int mid = (start + end) / 2;  might be possible that (start+end) will exceed the int range. So a better way to write mid is below.
            int mid = start + (end-start)/2;
            if (target == arr[mid])
                return mid;
            if (isAscending) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
