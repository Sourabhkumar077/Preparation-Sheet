/*
 * Generating a Multiplication Table for a Range
Difficulty: Easy
Topics: Arrays, Basic Programming
Description: Write a program to generate multiplication tables for numbers within a specified range.
Example:
Input: start = 2, end = 4
Output:

2 x 1 = 2   3 x 1 = 3   4 x 1 = 4  
2 x 2 = 4   3 x 2 = 6   4 x 2 = 8  
2 x 3 = 6   3 x 3 = 9   4 x 3 = 12  
2 x 4 = 8   3 x 4 = 12  4 x 4 = 16  

 */

import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first number : ");
       int st = sc.nextInt();
       System.out.println("Enter last number : ");
       int ed = sc.nextInt();
       sc.close();
       tablesInRange(st, ed);
    }
    public static void tablesInRange(int start , int end){
        for(int i = start; i <= end; i++){
            genrateTable(i);
            System.out.println();
        }
    }

    public static void genrateTable(int num){
        int res  = 1;
        for(int i = 1; res < num*10; i++){
         res = num * i;
         System.out.println( num + " x " + i + " = " + res);
        }
    }
}
