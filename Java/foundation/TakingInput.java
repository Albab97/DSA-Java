package foundation;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine()); // We can simply input an int by scn.nextInt(). But since it is followed by a String input also therefore we have to parse int.
        for(int i = 1 ; i<=n ; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        String name = scn.nextLine();
        System.out.println("Dear "+ name);
    }
}
