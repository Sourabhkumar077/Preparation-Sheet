/*
 * Finding All Pairs of Elements in an Array that Add Up to a Given Sum
Difficulty: Medium
Topics: Arrays, Hashing
Description: Write a program to find all pairs of elements in an array whose sum equals a specified target.
Example:
Input: array = [1, 2, 3, 4, 5], target = 5
Output: [(1, 4), (2, 3)]
Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3).
 */

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        pairSum(arr,target);
        sc.close();
    }
    public static void pairSum(int arr[],int target){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
