/*
 * Finding the Sum of Prime Factors of a Number
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to find the sum of the prime factors of a given number.
Example:
Input: number = 12
Output: 5
Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.
 */

import java.util.Scanner;

public class Problem48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        sc.close();
        primeFactorSum(number);
    }
    public static void primeFactorSum(int number){
        int sum = 0;
        for(int i = 2; i <= number; i++){
            if( number % i == 0){
                if(checkPrime(i)){
                    sum += i;
                }
            }
        }
        System.out.println("Prime factors sum of "+ number +" is " + sum);
    }

    public static boolean checkPrime(int num){
        for(int i = 2; i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
