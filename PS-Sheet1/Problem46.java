/*
 * Determining the Length of a String Without Using Built-In Functions
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to determine the length of a string without using built-in functions.
Example:
Input: string = "hello"
Output: 5
Explanation: The length of the string "hello" is determined without using built-in functions.
 */

import java.util.Scanner;

public class Problem46 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to find its length : ");
        String str = sc.nextLine();
        System.out.print("length of given string : ");
        System.out.print(findStrLength(str));
        sc.close();
    }
    public static int findStrLength(String str){
        // count whitespace a single character also
        int strlength = 0;
        for (char c : str.toCharArray()) {
            strlength++;
            // speacial character ignore this case
            if(c == '*'){
                System.out.println(c);
            }
        }
        return strlength;
    }
}