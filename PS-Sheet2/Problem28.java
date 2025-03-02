/*
 * Generating a Right-Angle Triangle Pattern of Numbers
Difficulty: Easy
Topics: Patterns
Description: Write a program to create a right-angle triangle pattern with numbers.
Example:
Input: height = 4
Output:

1  
12  
123  
1234  
 */
public class Problem28 {
    public static void main(String[] args) {
        int size = 4;
        printPattern(size);
    }
    public static void printPattern(int size){
        for (int i = 1; i <= size; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
