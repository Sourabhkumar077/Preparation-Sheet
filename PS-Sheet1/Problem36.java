/*
 * Finding the N-th Triangular Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the N-th triangular number.
Example:
Input: N = 4
Output: 10
Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers).
 */
import java.util.Scanner;
public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("The " + number + "th triangular number is " + triangularNumber(number));   
    }
    public static int triangularNumber(int n) {
        return (n * (n + 1)) / 2;
    }  
}
