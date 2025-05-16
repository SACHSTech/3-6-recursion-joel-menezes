package recursion;

public class SumOfDigits {
    /**
     * Description: Adding all the digits together result is returned
     * 
     * @param n the number you want the digits summed of
     * @return int Sum of all the digits
     * @author Joel
     */
    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        return sumOfDigits(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123)); // Output: 6
        System.out.println(sumOfDigits(100)); // Output: 1

    }
}
