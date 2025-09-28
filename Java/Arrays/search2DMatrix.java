package Arrays;

import java.util.Scanner;

public class search2DMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int m = scn.nextInt();
        System.out.println("Enter no. of columns:");
        int n = scn.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= scn.nextInt();
            }
        }
        System.out.println("Enter target element:");
        int target = scn.nextInt();
//        if (search2DMatrixForAnElement(matrix,target)) System.out.println("True, Element is present.");
//        else System.out.println("False, Element not present.");
        if (search2DMatrixOptimized(matrix,target)) System.out.println("True, Element is present.");
        else System.out.println("False, Element not present.");
    }

    // Time Complexity : O(m+n)
    static boolean search2DMatrixForAnElement(int[][] matrix, int target){
        if(matrix.length == 0) return false;
        int i,j;
        for( i = 0; i < matrix.length; i++ ){
            if(matrix[i][0] == target) return true;
            else if(matrix[i][0] > target) break;
        }
        if(i > 0) i--;
        for(j = 0; j < matrix[0].length; j++ ){
            if( matrix[i][j] == target ) return true;
        }
        return false;
    }
    static boolean search2DMatrixOptimized(int[][] matrix, int target){
        int m = matrix.length, n= matrix[0].length;
        int row = 0, col = 0;
        int start = 0, end = (m*n) - 1, mid;
        while(start <= end){
            mid = (start+end)/2;
            row = mid/n;
            col = mid%n;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }
}
