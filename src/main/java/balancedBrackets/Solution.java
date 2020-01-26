package balancedBrackets;

import java.util.Stack;

/**
 * @author ROSH - 1/22/2020
 */
public class Solution {

  // Complete the isBalanced function below.
  static String isBalanced(String s) {
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if (c == '(' || c == '[' || c == '{') {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return "NO";
        }

        char top = stack.pop();
        if (!((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{'))) {
          return "NO";
        }
      }
    }
    return (stack.isEmpty() ? "YES" : "NO");

  }
}