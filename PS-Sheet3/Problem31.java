/*
 * roblem 31: Print a Triangular Matrix with Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a triangular matrix where each row contains increasing numbers. Each subsequent row should start from the next number.

Example 1: Input: n = 3
Output:

1
2 3
4 5 6
 */
public class Problem31 {
    public static void main(String[] args) {
        int n = 3; // input value
        printTriangularMatrix(n);
    }

    public static void printTriangularMatrix(int n) {
        int num = 1; // starting number
        for (int i = 1; i <= n; i++) {
            // print row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // increment number
            }
            System.out.println();
        }
    }
}
