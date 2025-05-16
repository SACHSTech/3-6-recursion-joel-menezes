package recursion;

public class PowerFunction {
    /**
     * Description: Power function
     * 
     * @param base     the number being multiplied multiple times
     * @param exponent the multiplier of that number
     * @return int of the computed result
     * @author Joel
     */
    public static int power(int base, int exponent) {
        if (exponent == 1)
            return base * 1;
        else
            return power(base, exponent - 1) * base;

    }

    public static void main(String[] args) {
        System.out.println(power(3, 2)); // Output: 9
    }
}
