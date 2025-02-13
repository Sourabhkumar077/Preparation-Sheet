/*
 * Counting the Number of Palindromic Substrings in a String
Difficulty: Medium
Topics: String Manipulation
Description: Write a program to count how many palindromic substrings exist in a given string.
Example:
Input: string = "aaa"
Output: 6
Explanation: Palindromic substrings are "a", "a", "a", "aa", "aa", "aaa".
 */

import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        countPalindromicSubstrings(str);
        sc.close();
    }

    public static void countPalindromicSubstrings(String str){
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                if(isPalindrome(str.substring(i, j))){
                    System.out.print(str.substring(i, j) + " ");
                }
            }
        }
    }
    public static boolean isPalindrome(String str){
        int s = 0 , e = str.length() -1;
        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}
