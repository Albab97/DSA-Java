package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Guten Tag, ich bin glucklich";

        System.out.println(name.length());
        System.out.println(name.toLowerCase()); // just a method, does not change original string.
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf('b'));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println("    khfkh    ".strip()); // removes extra spaces
    }
}
