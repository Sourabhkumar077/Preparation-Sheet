/*
 * Finding the Count of Digits Greater Than a Specific Value
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to count how many digits in a number are greater than a specific value.
Example:
Input: number = 54321, value = 3
Output: 2
Explanation: The digits
 */
public class Problem37 {
    public static void main(String[] args) {
        int number = 54321;
        int value = 3;
        int count = countDigitsGreaterThanValue(number, value);
        System.out.println(count);
    }

    public static int countDigitsGreaterThanValue(int number, int value) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit > value) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

