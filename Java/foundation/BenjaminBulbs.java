package foundation;

import java.util.Scanner;

//Question Statement:
//        1. You are given n number of bulbs. They are all switched off. A weird fluctuation in voltage hits the circuit n times.
//        2. In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. You've to find which bulbs will be switched on after n fluctuations.
//        3. Take as input a number n, representing the number of bulbs.
//        4. Print all the bulbs that will be on after the nth fluctuation in voltage.
public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printBenjaminBulbs(n);
    }
    static void printBenjaminBulbs(int n){
        for (int nthBulb = 1; nthBulb<=n;nthBulb++){
            boolean flag = false;
            for (int tog=1 ; tog<=n ;tog++){
                if(nthBulb%tog==0){
                    flag=!flag;
                }
            }
            if(flag==true) System.out.print(nthBulb+" ");
        }
    }
    // A small insight : All the perfect square will have odd factors so we can also write this program simply as printing all perfect sqaures till n.

}
