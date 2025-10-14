package Strings;

public class Comparison {
    public static void main(String[] args) {
        String a = "German"; // part of String pool
        String b = "German"; // part of string pool, same as string variable a.

        System.out.println(a==b); // == operator compares the value of string as well checks the actual object it is pointing to

        String c = a; // c also points to the same string obj as a.
        System.out.println(c);
        System.out.println(c==a);

        // If we want to create different object with the same string value we can follow below method

        String str1 = new String("France"); // not a part of String pool.
        String str2 = new String("France"); // not a part of String pool, different object than str1.

        System.out.println(str1 == str2); // false, because objects are different now

        System.out.println(str1.equals(str2)); // true, because it only compares the string value.
    }

}
