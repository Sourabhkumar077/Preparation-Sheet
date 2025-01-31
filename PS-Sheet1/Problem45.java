/*
 * Finding the Mode of Numbers in an Array
Difficulty: Medium
Topics: Arrays, Statistical Analysis
Description: Write a program to find the mode (most frequent number) in an array.
Example:
Input: array = [1, 2, 2, 3, 4, 4, 4]
Output: 4
Explanation: The most frequent number in the array is 4.
 */
public class Problem45 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4 };
        System.out.println("Mode of Given array is : "+findMode(arr));
    }

    public static int findMode(int arr[]) {
        int count = 1, maxCount = 1, mode = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;// increment the count if the element is same as previous element
            } else {
                count = 1;// reset the count if the element is different from previous element
            }
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }
}
