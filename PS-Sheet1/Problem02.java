   /*
 * Checking for Prime Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to determine if a number is prime.
Example:
Input: number = 7
Output: Prime

 */
public class Problem02 {
public static void main(String[] arg) {
    int num = 7;
    for( int i=2; i < num; i++){
        if(num == 1){
            System.out.println("1");
        }
        if(num % i == 0){
            System.out.println(" Not Prime");
            
        }
    }
    System.out.println("Prime");
}
}
