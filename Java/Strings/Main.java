package Strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "Albab";
        System.out.println(str);
        str = "Ahmed"; // now a new object "Ahmed" will be created in string pool and str will be pointing to that. object -> "Albab" will be dereferenced.
        System.out.println(str);
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        // String reverse
        String s = "Tinnu";
        System.out.println(Arrays.toString(s.toCharArray()));
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.toCharArray()[i]);
        }
        System.out.println();
        
        String sentence = "Tinnu is a good boy.";
        System.out.println(Arrays.toString(sentence.split(" ")));
        System.out.println(sentence.split(" ").length);
        for (int i = 0; i < sentence.split(" ").length; i++) {
            System.out.println(sentence.split(" ")[i]);
        }
    }
}
