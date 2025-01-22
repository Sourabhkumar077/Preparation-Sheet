/*
 * Problem1 * Determining Even/Odd Numbers
Difficulty: Easy
Topics: Basic Programming
Description: Write a program to check whether a number is even or odd.
Example:
Input: number = 4
Output: Even
Explanation: Since 4 is divisible by 2, it is an even number.
 */
public class Problem1 {

    public static void main(String[]args){
        int num = 4;
        if(num % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println(" Not Even");
        }
    }
}