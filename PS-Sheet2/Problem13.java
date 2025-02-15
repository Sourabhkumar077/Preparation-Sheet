/*
 * Finding the Sum of the First N Prime Numbers
Difficulty: Medium
Topics: Prime Numbers, Mathematical Computations
Description: Write a program to calculate the sum of the first N prime numbers.
Example:
Input: N = 4
Output: 17
Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.
 */

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth Number : ");
        int range = sc.nextInt();
        System.out.println("Prime Number sum efore " + range + " is  = " + primeNumSum(range));
        sc.close();

    }
    public static int primeNumSum(int range){
        int count = 0;
        int primeSum = 0;
        for(int i = 2; count < range; i++){
            if(checkPrime(i)){
                primeSum += i;
                count++;
            }
        }
        return primeSum;
    }
    public static boolean checkPrime(int num){
        for( int i  = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
