package recursion;

public class CountDownTimer {
    /**
     * Description: Counts down from desired n
     * 
     * @param n the number counting down from
     * @author Joel
     */
    public static void countDown(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            countDown(n - 1);
        }
    }

    public static void main(String[] args) {
        countDown(5); // Output: 5 4 3 2 1
    }
}