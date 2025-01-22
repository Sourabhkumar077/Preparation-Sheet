/*
 * Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153 or 371
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153
 */
public class Problem4 {
    public static void main(String[] args) {
        int originalNum = 371, num, remainder, result = 0;
        num = originalNum;
        while (num != 0) {
            remainder = num % 10;
            result = result + (int) Math.pow(remainder, 3);
            num = num / 10;
        }
        if (result == originalNum) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

}
