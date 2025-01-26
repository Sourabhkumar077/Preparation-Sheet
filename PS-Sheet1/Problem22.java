import java.util.Scanner;

/*
Calculating the Sum of Odd Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to find the sum of all odd numbers within a given range.
Example:
Input: range = [1, 10]
Output: 25
Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.
 */
public class Problem22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start number : ");
        int start = sc.nextInt();
        System.out.print("Enter End number : ");
        int end = sc.nextInt();
        sc.close();

        System.out.println("Sum of odd number between " + start + " and "+ end +" is "+ sumOfOddInRange(start,end));

    }
    public static int sumOfOddInRange(int start,int end){
        int oddSum = 0;
        for(int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        return oddSum;
    }
}
