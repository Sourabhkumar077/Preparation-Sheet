/*
Calculating the Sum of Even Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all even numbers within a given range.
Example:
Input: range = [1, 10]
Output: 30
Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30.
 */

import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start number : ");
        int start = sc.nextInt();
        System.out.print("Enter End number : ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Sum of even number between " + start + " and "+ end +" is "+ sumOfEvensInRange(start,end));

    }
    public static int sumOfEvensInRange(int start , int end){
        int sum = 0;
        for(int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
