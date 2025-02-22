package Recursion;

public class StringPalindome {
    // check if a string is palindrome using recursion
    public static void main(String[] args) {
        System.out.println(isPalindromeORnot("madam", 0, 4));
    }


    public static boolean isPalindromeORnot(String str , int s, int e) {
        if(s>=e) return true;
        if(str.charAt(s) != str.charAt(e)) return false;
        return isPalindromeORnot(str, s+1, e-1);
}

}

