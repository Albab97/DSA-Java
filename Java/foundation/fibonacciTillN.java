package foundation;

import java.util.Scanner;

public class fibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0, b = 1;
        if (n < 1) {
            System.out.println(a);
        } else {
            System.out.println(a);
            System.out.println(b);
            int c = a + b;
            while (c <= n) {
                c = a + b;
                if (c > n) break;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
