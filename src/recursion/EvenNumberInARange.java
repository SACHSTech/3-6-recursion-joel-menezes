package recursion;

public class EvenNumberInARange {
    /**
     * Description: printing even numbers between a set range
     * 
     * @param start where to start counting
     * @param end   where to end counting
     * @author Joel
     */
    public static void printEvens(int start, int end) {
        if (end != start) {
            if (end % 2 == 0)
                System.out.print(end + " ");
            printEvens(start, end - 1);
        }

    }

    public static void main(String[] args) {
        printEvens(5, 100); // Output: 100 98 96 94 92 90 88 86 84 82 80 78 76 74 72 70 68 66 64 62 60 58 56
                            // 54 52 50 48 46 44 42 40 38 36 34 32 30 28 26 24 22 20 18 16 14 12 10 8 6
    }
}
