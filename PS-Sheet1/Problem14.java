/*
 * Finding the Largest and Smallest Numbers in an Array
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find the largest and smallest numbers in an array.
Example:
Input: array = [4, 7, 1, 8, 5]
Output: Largest: 8, Smallest: 1
Explanation: The largest number in the array is 8 and the smallest is 1.
 */

import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = {4, 7, 1, 8, 5, 3, 9};
        int minEle = Integer.MAX_VALUE;
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(maxEle < array[i]){
                maxEle = array[i];
            }
            if(minEle > array[i]){
                minEle = array[i];
            }
        }
        System.out.println("Max Element : " + maxEle + " Min Element :" + minEle);
        sc.close();
    }
}
