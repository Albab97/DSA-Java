package Arrays;

import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of nxn matrix: ");
        int n = scn.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }
//        transposeOfAMatrix(matrix);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j]+ " ");
//            }
//            System.out.println();
//        }
        rotateMatrixBy90Degree(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void transposeOfAMatrix(int[][] matrix){
        int n = matrix.length;
        int s=0;
        while(s<n){
            for (int i = s; i < n; i++) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[s][i];
                matrix[s][i] = temp;
            }
            s++;
        }
    }
    static void rotateMatrixBy90Degree(int[][] matrix){
        int n = matrix.length;
        transposeOfAMatrix(matrix);
        // Now just reverse each row
        for (int row = 0; row < n; row++) {
            // reverse an array by two pointer approach
            int start=0,end=n-1;
            while(start<end){
                int temp = matrix[row][start];
                matrix[row][start] = matrix[row][end];
                matrix[row][end] = temp;
                start++;end--;
            }
        }
    }
}
