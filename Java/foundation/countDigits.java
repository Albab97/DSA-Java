package foundation;

import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
//        System.out.println(countDigits(n));
//        System.out.println(sumOfDigits(n));
//        digitsOfNumber(n);
        printReverseDigits(n);
    }
    static int countDigits(int num){
        if(num==0) return 1;
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int sumOfDigits(int num){
        int sum = 0;
        while (num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    static void digitsOfNumber(int num){
        int count = countDigits(num);
        // making of the divisor
        int div=1;
        count--;
        while(count!=0){
            count--;
            div=div*10;
        }
        //printing the digits
        while(div!=0){
            System.out.println(num/div);
            num=num%div;
            div=div/10;
        }
    }
    static void printReverseDigits(int num){
        if(num==0) System.out.println(num);
        while(num!=0){
            int r = num%10;
            System.out.println(r);
            num=num/10;
        }
    }
}
