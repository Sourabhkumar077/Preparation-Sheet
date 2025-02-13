/*
 * Finding the Sum of the First N Odd Numbers
Difficulty: Easy
Topics: Mathematical Computations
Description: Write a program to calculate the sum of the first N odd numbers.
Example:
Input: N = 5
Output: 25
Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.
 */

import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        sc.close();

        System.out.println("Sum of first" + n + " numbers is : " + sumOfOddNum(n));
    }
    public static int sumOfOddNum(int n){
        int oddCount = 0, oddSum = 0;
        for(int i = 1; oddCount < n; i++){
            if(i % 2 != 0){

                oddCount++;
                oddSum += i;
            }
        }
        return oddSum;
    }
}
