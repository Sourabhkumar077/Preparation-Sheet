/*
 * Calculating the Sum of Digits of a Number Until Single Digit
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to keep summing the digits of a number until a single digit is obtained.
Example:
Input: number = 9875
Output: 2
Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.
 */
import java.util.Scanner;
public class Problem40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        System.out.println("The sum of digits of " + number + " is: " + sumOfDigits(number));
    }
    public static int sumOfDigits(int number) { 
        int sum = 0; 
        while (number > 0) { 
            int digit = number % 10; 
            sum += digit; 
            number /= 10; 
        } 
        // calls it self again and again untill the sum is single digit
        if(sum > 9) { 
            return sumOfDigits(sum);
        }
        return sum; 
    }
}

