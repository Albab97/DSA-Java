package foundation;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello World.");
        System.out.println();
        System.out.print("hi there\n");
        System.out.println("ldslkds");
        System.out.println("*\n**\n***\n****\n*****\n");
        printZ();
        grading(70);
    }
    static void printZ(){
        System.out.println("*****\n   *\n  *\n *\n*****");
    }
    static void grading(int marks){
        if(marks > 90){
            System.out.println("Excellent");
        }else if(marks > 80){
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("Fair");
        } else if (marks > 60) {
            System.out.println("Meets Expectation");
        }else{
            System.out.println("below par");
        }
    }
}
