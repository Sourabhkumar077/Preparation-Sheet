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
        findGcd(arr);
    }
    public static void findGcd(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(maxEle < arr[i]) {
                maxEle = arr[i];
            }
        }
        int n = arr.length;
        for(int i = maxEle; i > 0; i--) {
            boolean flag = true;
            for(int j = 0; j < n; j++) {
                if(arr[j] % i != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(i);
                return;
            }
            } 
    }
}
