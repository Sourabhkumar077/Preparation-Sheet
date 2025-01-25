import java.util.Scanner;

/*
Checking for Perfect Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is a perfect number.
Example:
Input: number = 28
Output: Perfect Number
Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
 */
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check : ");
        int number = sc.nextInt();
        if(checkPerfect(number)){
            System.out.println("Perfect Number");
        }else {
            System.out.println(" Not a Perfect Number");
        }
    }
    public static boolean checkPerfect(int number){
        int divisorSum = 0;
        for(int i = 1; i < number ; i++){
            if(number % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum == number;
    }
}
