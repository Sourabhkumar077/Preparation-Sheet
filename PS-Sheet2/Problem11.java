/*
 * Finding the Largest Prime Factor of a Number
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find the largest prime factor of a given number.
Example:
Input: number = 28
Output: 7
Explanation: The prime factors of 28 are 2 and 7, with the largest being 7.
 */

import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        sc.close();
        System.out.println();
        findPrimeFactors(number);
    }
    static void findPrimeFactors(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                if(checkPrime(i)){
                    System.out.print(i + " ");
                }
            }
        }
    }
    static boolean checkPrime(int num){
        for(int i = 2; i < num; i++){
            if( num % i == 0){
                return false;
            }
            
        }
        return true;
    }
}
