/*
 * Finding the Number of Perfect Numbers Up to a Given Limit
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find how many perfect numbers exist up to a given limit.
Example:
Input: limit = 30
Output: 2
Explanation: There is only two  perfect number (6 , 28) up to 30.
 */

import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a limit: ");
       int limit = sc.nextInt() ;
       sc.close();
       for(int i = 1; i <= limit; i++){
           if(checkPerfect(i)){
               System.out.println(i);
           }
       }
       
    }
    public static boolean checkPerfect(int number){
        int divisorSum = 0;
        for(int i = 1; i < number ; i++){
            if(number % i == 0){
                divisorSum += i;
            }
        }
        return divisorSum == number;
    }
}
