/*
 * Finding Missing Numbers in a Sequence
Difficulty: Easy
Topics: Basic Programming, Arrays
Description: Write a program to find missing numbers in a sequence from 1 to n.
Example:
Input: sequence = [1, 2, 4, 5]
Output: [3]
Explanation: The missing number in the sequence from 1 to 5 is 3.
 */

import java.util.Arrays;

public class Problem30 {
    public static void main(String[] args) {
        int arr[] = { 1, 2,3, 4, 5, 6 ,5,7,9,12,13,24, };
        Arrays.sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
        int ele = 1;
        for (int i = 0; i < arr.length; i++) {
            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            if (arr[i] == ele) {
                ele++;
            } else if (arr[i] > ele) {
                System.out.println("Missing Number is : " + ele);
                return; // Exit as soon as the first missing number is found
            }
        }

        System.out.println("Missing Number is : " + ele);
    }
}
