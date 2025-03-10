
/*
 * Finding the Common Elements in Two Arrays
Difficulty: Medium
Topics: Arrays
Description: Write a program to find common elements between two arrays.
Example:
Input: array1 = [1, 2, 3, 4], array2 = [3, 4, 5, 6]
Output: [3, 4]
Explanation: The common elements between the two arrays are 3 and 4.
 */
import java.util.Arrays;

public class Problem39 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {3, 4, 5, 6};
        int[] commonElements = findCommonElements(array1, array2);
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        int[] commonElements = new int[Math.min(array1.length, array2.length)];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements[index++] = array1[i];
                }
            }
        }
        return Arrays.copyOf(commonElements, index);
    }
}
