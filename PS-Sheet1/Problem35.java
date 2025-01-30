/*
 * Finding the Sum of Prime Numbers in a Range
Difficulty: Medium
Topics: Number Theory, Mathematical Computations
Description: Write a program to calculate the sum of all prime numbers within a given range.
Example:
Input: range = [1, 10]
Output: 17
Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.
 */

import java.util.Scanner;

public class Problem35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter start Number : ");
        int start = s.nextInt();
        System.out.print("Enter ending number : ");
        int end = s.nextInt();
        s.close();

        System.out.println("Sum of Primes in range : " + primesLessThanRange(start,end));
    }
    public static int primesLessThanRange( int start,int end){
        int primeSum = 0;
        for (int i = 2; i <= end; i++){
            if(checkPrime(i)){
                primeSum+=i;
            }
        }
        return primeSum;
    }
    public static boolean checkPrime(int num){
        for(int i = 2; i <= num /2 ; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
