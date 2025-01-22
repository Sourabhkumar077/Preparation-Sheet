import java.util.Scanner;
/*
 * Summing Digits of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the sum of digits of a number.
Example:
Input: number = 1234
Output: 10
Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10
 */

public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = sc.nextInt();
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
