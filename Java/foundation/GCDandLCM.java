package foundation;

import java.util.Scanner;

public class GCDandLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        System.out.println("GCD is "+gcd(num1,num2));
        System.out.println(("LCM is "+lcm(num1,num2)));
    }
    static int gcd(int num1, int num2){
        int l = (num1 > num2) ? num2 : num1;
        int result=1;
        for (int i = 2; i <= l; i++){
            if(num1%i==0){
                if(num2%i==0)
                    result=i;
            }else {
                if(num2%i==0){
                    if(num1%i==0)
                        result=i;
                }
            }
        }
        return result;
    }
    static int lcm(int num1, int num2){
        int gcd = gcd(num1, num2);
        int result = num1*num2;
        result= result/gcd;
        return result;
    }
}
