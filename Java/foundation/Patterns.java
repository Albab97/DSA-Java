package foundation;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        pattern1(n);
//        pattern2(n);
        pattern3(n);
    }
    static void pattern1(int n){
        for (int i =1 ; i<=n; i++){
            for (int j = 1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int i=n;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=n; i>=1; i--){
            int j;
            for( j=1; j<=(i-1); j++){
                System.out.print(" ");
            }
            for(int k = j ; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
