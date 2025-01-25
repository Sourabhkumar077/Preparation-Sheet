import java.util.Scanner;

/*
Generating Multiplication Tables
Difficulty: Easy
Topics: Basic Programming, Mathematical Computations
Description: Write a program to generate multiplication tables for a given number.
Example:
Input: number = 4
Output:
    4 x 1 = 4
    4 x 2 = 8
    4 x 3 = 12
    4 x 4 = 16
    4 x 5 = 20
 */
public class Problem18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its table : ");
        int number = sc.nextInt();
        printTable(number);
        sc.close();
    }
    public static void printTable(int number){
        int result = 1;
        for(int i = 1; result < number * 10; i++){
            result = number * i;
            System.out.println( number + " x " + i + " = " + result );
        }
    }
}
