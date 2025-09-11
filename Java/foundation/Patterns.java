package foundation;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
        pattern5(n);
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
    static void pattern4(int n){
        int sp = 0, st = n;
        for(int i=1 ; i<=n ; i++){
            for (int j=1 ; j<=sp ; j++){
                System.out.print(" ");
            }
            for (int j=1 ; j<=st; j++){
                System.out.print("*");
            }
            sp++;
            st--;
            System.out.println();
        }
    }
    static void pattern5(int n){
        int sp = n/2, st =1 ;
        for (int i=1; i<=n ; i++){
//            System.out.println(sp+" , "+st);
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=st;j++){
                System.out.print("*");
            }
            if(i<=n/2) {
                sp--;
                st = st + 2;
            }else{
                sp++;
                st=st - 2;
            }
            System.out.println();
        }
    }
}
