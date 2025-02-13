
/*
 * Generating a Diamond Pattern of Stars
Difficulty: Medium
Topics: Patterns, Basic Programming
Description: Write a program to create a diamond pattern with stars of a given size.
Example:
Input: size = 5
Output:

  *  
 ***  
*****  
 ***  
  *  
 */

public class Problem05 {
   public static void main(String[] args) {
    printDiamond();
   } 
   public static void printDiamond() {
    
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5 - i - 1; j++) {
             System.out.print(" ");
         }
         for (int k = 0; k <= i; k++) {
             System.out.print("* ");
         }
         System.out.println();
     }
     for (int i = 3; i >= 0; i--) {
         for (int j = 0; j < 5 - i - 1; j++) {
             System.out.print(" ");
         }
         for (int k = 0; k <= i; k++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}

