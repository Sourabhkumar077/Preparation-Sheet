/*
 *      Finding the Second Largest Number in an Array
Difficulty: Medium
Topics: Arrays, Sorting
Description: Write a program to find the second largest number in an array.
Example:
Input: array = [10, 20, 4, 45, 99]
Output: 45
Explanation: The second largest number in the array is 45.
 */
public class Problem49 {
    public static void main(String[] args) {
        int arr[] = {10,20,4,45,99,56,87,23};
        secondLargest(arr);
    }
    public static void secondLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= largest){
                largest = arr[i];
            }
        }
        for(int i  = 0; i < arr.length; i++){
            if(arr[i] >= secondLargest && arr[i] < largest){
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest is : " + secondLargest);
    }
}
