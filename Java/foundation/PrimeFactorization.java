package foundation;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printPrimeFactorization(n);
    }
    static void printPrimeFactorization(int n){
        for(int div = 2; div<= n/2; div++){
            while (n%div==0){
                System.out.print(div+" ");
                n=n/div;
            }
        }
        if(n!=1) System.out.print(n);
    }
}
