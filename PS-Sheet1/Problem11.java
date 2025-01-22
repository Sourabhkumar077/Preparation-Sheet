/*Finding the Least Common Multiple (LCM)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the LCM of two numbers.
Example:
Input: a = 12, b = 15
Output: 60
Explanation: The LCM of 12 and 15 is 60. */

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        int lcm = findLCM(a, b);
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);

        scanner.close();
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
