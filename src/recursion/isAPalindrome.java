package recursion;

public class isAPalindrome {
    /**
     * Description: Checks if a string is a palindrome. Palindrome's are strings
     * that are the same front and backwards
     * 
     * @param s String to check
     * @return bool if palindrome
     * @author Joel
     */
    public static boolean isPalindrome(String s) {
        if (s.equals(""))
            return true;
        else if (s.length() == 1)
            return true;
        else if (s.charAt(0) == s.charAt(s.length() - 1))
            return isPalindrome(s.substring(1, s.length() - 1));
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Forrest Frank")); // False
        System.out.println(isPalindrome("yay"));// True
        System.out.println(isPalindrome("racecar")); // True
        System.out.println(isPalindrome("race car")); // False

    }
}
