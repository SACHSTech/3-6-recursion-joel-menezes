package recursion;

public class SumofNaturalNumbers {
    /**
     * Description: Summing every single digit from n down to 1 sequentially
     * 
     * @param n number to sum
     * @return int summed of all digits from n to 1
     * @author Joel
     */
    public static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(sum(10)); // Output: 55
    }
}
