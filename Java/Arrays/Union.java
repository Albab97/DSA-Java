package Arrays;

import java.util.Scanner;

public class Union {
    // Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
    //The union of two arrays can be defined as the common and distinct elements in the two arrays.
    // NOTE: Elements in the union should be in ascending order.
//    Example 1:
//    Input:
//    n = 5,m = 5.
//    arr1[] = {1,2,3,4,5}
//    arr2[] = {2,3,4,4,5}
//    Output:
//    {1,2,3,4,5}
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = scn.nextInt();
        }
        int[] result = unionOfTwoSortedArrays(n, arr1, m, arr2);
        for (int num : result){
            System.out.print(num+" ");
        }
    }
    static int[] unionOfTwoSortedArrays(int n, int[] arr1,int m, int[] arr2){
        int i=0,j=0,k=0;
        int[] res = new int[n+m];
        // comparison for the first element
        if(arr1[i]<arr2[j]){
            res[k]=arr1[i];
            i++; k++;
        }else if (arr1[i]==arr2[j]){
            res[k]=arr1[i];
            i++; j++; k++;
        }else {
            res[k] = arr2[j];
            j++;k++;
        }
        // comparison for the rest of the array
        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(res[k-1]!=arr1[i]) res[k++]=arr1[i];
                i++;
            }else if (arr1[i]==arr2[j]){
                if(res[k-1]!=arr1[i]) res[k++]=arr1[i];
                i++; j++;
            }else {
                if(res[k-1]!=arr2[j]) res[k++] = arr2[j];
                j++;
            }
        }
        while(i<n){
            if(res[k-1]!=arr1[i]) res[k++]=arr1[i];
            i++;
        }
        while(j<m){
            if(res[k-1]!=arr2[j]) res[k++]=arr2[j];
            j++;
        }
        return res;
    }
}
