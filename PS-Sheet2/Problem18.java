/*
 * Finding All Subsets of a Set
Difficulty: Medium
Topics: Combinatorics
Description: Write a program to generate all possible subsets of a given set of numbers.
Example:
Input: set = [1, 2]
Output: [[], [1], [2], [1, 2]]
Explanation: The subsets of [1, 2] are the empty set, [1], [2], and [1, 2].
 */
public class Problem18 {
    public static void main(String[] args) {
        int[] set = {1, 2, 3};
        generateSubsets(set);
    }
    public static void generateSubsets(int[] set) {
        int n = set.length;
        int max = 1 << n; // 2^n

        for (int i = 0; i < max; i++) {
            System.out.print("{");
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(set[j] + " ");
                }
            }
            System.out.println("}");
        }
    }
}
