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
    }
}
