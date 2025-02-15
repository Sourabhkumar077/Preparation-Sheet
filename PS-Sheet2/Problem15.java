/*
 * Finding the Sum of Numbers in a String
Difficulty: Easy
Topics: String Manipulation
Description: Write a program to extract and sum all numbers present in a given string.
Example:
Input: string = "The numbers are 12 and 34"
Output: 46
Explanation: The sum of numbers 12 and 34 is 46.
 */

import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("Sum of numbers: " + numberSumInString(str));
    }

    public static int numberSumInString(String str) {
        int sum = 0;
        int num = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Forming a number
            } else {
                sum += num; // Add previous number to sum
                num = 0;    // Reset num
            }
        }
        sum += num; // Add the last number if present
        return sum;
    }
}
