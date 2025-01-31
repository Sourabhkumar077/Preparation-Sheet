/*
*Finding the Sum of Squares of Digits
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of the squares of the digits of a number.
Example:
Input: number = 123
Output: 14
Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.
 */
import java.util.Scanner;
public class Problem38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        int sumOfSquares = 0;
        System.out.println("The sum of the squares of the digits of " + number + " is: " + sumOfSquares(number));
    }
    public static int sumOfSquares(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
}
