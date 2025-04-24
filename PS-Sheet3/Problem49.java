/*
 * Problem 49: Print a Pattern of Alternating Rows and Columns of Numbers
Difficulty: Easy
Topics: Pattern Printing
Hint: Print a pattern with alternating rows and columns of numbers, where each row and column increases sequentially.

Example 1: Input: n = 3
Output:

123
456
789

 */
public class Problem49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt(); // input value
        printPattern(n);
    }

    public static void printPattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
