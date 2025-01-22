/*
 * Finding the Greatest Common Divisor (GCD)
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find the GCD of two numbers.
Example:
Input: a = 48, b = 18
Output: 6
Explanation: The GCD of 48 and 18 is 6.
 */

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        int st ;
        if(num1 > num2){
            st = num1;
        }else{
            st = num2;
        }
        for(int i = st; st > 2; i--){
            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("GCD is: " + i);
                break;
            }
        }
        sc.close();
    }
}
