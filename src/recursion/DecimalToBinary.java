package recursion;

public class DecimalToBinary {

    /**
     * Description: Converting a decimal number to a bianary number
     * 
     * @param n decimal number to be converted
     * @return decimal to bianary conversion in String
     * @author Joel
     */
    public static String toBinary(int n) {
        if (n == 1)
            return "1";
        else if (n == 0)
            return "0";
        else if (n % 2 == 1)
            return toBinary(n / 2) + "1";
        else
            return toBinary(n / 2) + "0";
    }

    public static void main(String[] args) {
        System.out.println(toBinary(213123)); // Output 110100000010000011
    }
}
