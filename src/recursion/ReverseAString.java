package recursion;

public class ReverseAString {
    /**
     * Description: This method reverses Strings
     * 
     * @param s String to be reversed
     * @return String that is reversed
     * @author Joel
     */
    public static String reverse(String s) {
        if (s.length() == 0)
            return "";
        else
            return s.substring(s.length() - 1, s.length())
                    + reverse(s.substring(0, s.length() - 1));

    }

    public static void main(String[] args) {
        System.out.println(reverse("Forrest Frank")); // Output: knarF tserroF
    }
}
