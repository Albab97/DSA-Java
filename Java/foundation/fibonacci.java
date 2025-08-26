package foundation;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a=0,b=1,c=1;
        System.out.println(a);
        for(int i=1;i<n;i++){
            System.out.println(c);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
