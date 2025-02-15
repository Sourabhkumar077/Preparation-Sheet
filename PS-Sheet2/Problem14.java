/*
 * Checking for a Balanced Bracket Sequence
Difficulty: Medium
Topics: String Manipulation, Stack
Description: Write a program to check if a given string with brackets is balanced.
Example:
Input: string = "{[()]}"
Output: True
Explanation: The brackets are balanced.
 */
import java.util.Stack;

public class Problem14 {
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Push opening brackets
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatching(top, ch)) {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // True if all brackets are matched
    }

    public static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        // you can also takee the strig as a user input
        
        String str = "{[()]}";  // Example input
        System.out.println(isBalanced(str) ? " String is Balanced" : " String isNot Balanced");
    }
}

