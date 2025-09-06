package foundation;

import java.util.Scanner;

import static java.lang.Math.pow;
//Question Statement:
//        1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k.
//        Also k can have an absolute value larger than number of digits in n.
//        2. Take as input n and k.
//        3. Print the rotated number.
//        4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//          n = 12340056
//          k = 3
//          r = 05612340

public class RotateNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        System.out.println(rotateANumber(num,k));
    }
    static int rotateANumber(int num, int k){
        // count the digits first
        int digs = 0;
        if(num==0) {
            digs = 1;
        }else {
            int temp = num;
            while (temp > 0) {
                temp = temp / 10;
                digs++;
            }
        }
        // Adjusting the rotations
        k = k % digs;
        if(k<0) k=k+digs;

        // Now rotate the number
        for (int i = 0; i < k; i++) {
            num = rotateBy1(num,digs);
        }
        return num;
    }
    static int rotateBy1(int num, int digs) {
        int r = num % 10;
        int d = num / 10;
        num = d + r * (int) pow(10, digs - 1);
        return num;
    }
}
