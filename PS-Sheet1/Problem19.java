import java.util.Scanner;

/*
Finding Prime Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all prime numbers within a given range.
Example:
Input: range = [10, 30]
Output: [11, 13, 17, 19, 23, 29]
Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.
 */
public class Problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start of range : ");
        int start = sc.nextInt();
        System.out.print("Enter enter of range : ");
        int end = sc.nextInt();
        sc.close();

        checkPrimesInRange(start,end);
    }
    public static void checkPrimesInRange(int start , int end){
        for(int i = start; i <= end; i++){
            if (!checkPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean checkPrime(int number){
        for(int i = 2; i < number / 2; i++){
            if(number % i == 0){
                return true;
            }
        }
        return false;
    }
}
