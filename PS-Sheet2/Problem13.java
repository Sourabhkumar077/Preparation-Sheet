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
public class Problem13 {
    public static void main(String[] args) {
        
    }

    public static boolean heckPrime(int num){
        for( int i  = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
