/*
 * Generating the Fibonacci Series
Difficulty: Easy
Topics: Basic Programming, Sequences
Description: Write a program to generate the Fibonacci series up to a given number.
Example:
Input: limit = 10
Output: [0, 1, 1, 2, 3, 5, 8]
Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].


 */
public class Problem5 {
    public static void Fibonacci(int limit){
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        System.out.print(n1 + " " + n2 + " ");
        for(int i = 1; i < limit; i++){
            n3 = n1 + n2;
            if (n3 < limit) {
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
            }
        } 
    }
    public static void main(String[] args) {
        Fibonacci(10);
    }
}
