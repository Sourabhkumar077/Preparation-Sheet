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

/*
 * 🔹 Step-by-Step Explanation
1️⃣ Using a Stack Data Structure
A stack follows LIFO (Last In, First Out), meaning the last bracket added will be the first one removed.
This helps in checking nested brackets easily.

2️⃣ Processing Each Character

If it’s an opening bracket ({, [, () → Push it onto the stack.
If it’s a closing bracket (}, ], )):
Check if the stack is empty (if yes, return false because there's no opening bracket).
Pop the top element from the stack and check if it matches the current closing bracket.
If it doesn't match, return false (because of incorrect pairing).

3️⃣ Final Check

After processing all characters, if the stack is empty, the brackets were properly matched → return true.
If the stack is not empty, some opening brackets were not closed → return false.

 */
