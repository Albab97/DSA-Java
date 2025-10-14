package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(checkPalindrome(str));
    }
    static boolean checkPalindrome(String str){
        if(str == null || str.length() == 0) return true;
        char start = str.charAt(0);
        char end = str.charAt(str.length()-1);
        for(int i = 0; i <= str.length()/2; i++) {
            if(start != end) return false;
            start = str.charAt(i);
            end = str.charAt(str.length()-1-i);
        }
        return true;
    }
}
