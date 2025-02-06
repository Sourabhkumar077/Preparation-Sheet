/*
 * Finding the Number of Perfect Numbers Up to a Given Limit
Difficulty: Medium
Topics: Number Theory
Description: Write a program to find how many perfect numbers exist up to a given limit.
Example:
Input: limit = 30
Output: 1
Explanation: There is only one perfect number (6) up to 30.
 */

public class Problem10 {
    public static void main(String[] args) {
        // also can take range as a user input
        perfectNumInRange(30);
    }

    public static void perfectNumInRange(int range) {
        int count = 0;
        for (int i = 2; i < range; i++) {
            if (isperfect(i)) {
                count++;
                System.out.println("perfefct number : " + i);
            }
        }
        System.out.println(count);
    }

    public static boolean isperfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}
