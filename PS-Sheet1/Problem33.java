/*
 * alculating the Power of a Number
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to calculate the power of a number.
Example:
Input: base = 2, exponent = 3
Output: 8
Explanation: 2 raised to the power of 3 is 8.
 */

import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value : ");
        int base = sc.nextInt();
        System.out.println("Enter exponent value : ");
        int exponent = sc.nextInt();
        System.out.println("Power value of number" + base + " in exponent "+exponent+ " is = " + findPower(base, exponent));

    }

    public static int findPower(int base , int exponent){
        int result = 1;
        while(exponent > 0){
            result = base * result;
            exponent--;
        }
        /*
         * Or we can use inbuilt math function & typecast the value into integer from double
         *  result = (int)Math.pow(base , exponent);  
         */
        return result;
    }
}
