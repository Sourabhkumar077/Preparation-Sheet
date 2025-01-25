/**
 * Finding the Sum of Elements in an Array
 * Difficulty: Easy
 * Topics: Basic Programming, Arrays
 * Description: Write a program to find the sum of elements in an array.
 * Example:
 * Input: array = [1, 2, 3, 4, 5]
 * Output: 15
 * Explanation: The sum of the elements in the array is 15.
 */


public class Problem16 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of Array element is : " + sum);
    }
}
