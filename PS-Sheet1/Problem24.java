import java.util.Scanner;

/*
Printing Prime Numbers Less Than a Given Number
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to print all prime numbers less than a given number.
Example:
Input: number = 20
Output: 2, 3, 5, 7, 11, 13, 17, 19
Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.
 */
public class Problem24 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = s.nextInt();
        s.close();
//        final function call
        primesLessThanRange(number);

    }
    public static void primesLessThanRange(int number){
        for (int i = 2; i <= number; i++){
            if(checkPrime(i)){
                System.out.print(i + " ");
            }
        }
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
