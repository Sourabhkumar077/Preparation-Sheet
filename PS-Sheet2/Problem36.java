
/*
 * Finding the Sum of the First N Even Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the first N even numbers.
Example:
Input: N = 4
Output: 20
Explanation: The first 4 even numbers are 2, 4, 6, 8, and their sum is 20
 */
public class Problem36 {
    public static void main(String[] args) {
        int N = 4;
        int sum = sumOfFirstNEvenNumbers(N);
        System.out.println(sum);
    }

    public static int sumOfFirstNEvenNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += 2 * i;
        }
        return sum;
    }
}
