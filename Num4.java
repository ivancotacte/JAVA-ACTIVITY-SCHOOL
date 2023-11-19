public class Num4 {
    public static void main(String[] args) {
        int n = 6;
        printPyramid4(n);
    }
    static void printPyramid4(int n) {
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}