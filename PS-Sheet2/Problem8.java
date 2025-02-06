
/*
 * Finding the GCD of Multiple Numbers
Difficulty: Medium
Topics: Mathematical Computations
Description: Write a program to find the GCD (Greatest Common Divisor) of an array of numbers.
Example:
Input: array = [12, 24, 36]
Output: 12
Explanation: The GCD of 12, 24, and 36 is 12.
 */
public class Problem8 {
    public static void main(String[] args) {
      int arr[] = {12, 24, 36}; 
      findGcdOfNum(12);
    }
    // public static void findGcd(int[] arr){
    //   int max = Integer.MIN_VALUE;
    //     for(int i = 0; i < arr.length; i++){
    //       if(arr[i ] > max){
    //         max = arr[i];
    //       }
    //     }

    //     for(int i = max; i > 0 || arr.length > 0; i--){
          
    //     }
    // }

    public static void findGcdOfNum(int num){
      int gcd = num;
      for(int i = num - 1; i > 0; i--){
        if( num % i == 0){
          gcd = i;
          break;
        }
      }
      System.out.println(gcd);
    }
}
