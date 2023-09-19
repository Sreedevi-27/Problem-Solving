/*
921. Minimum Add to Make Parentheses Valid
MEDIUM

A parentheses string is valid if and only if:
i) It is the empty string,
ii) It can be written as AB (A concatenated with B), where A and B are valid strings, or
iii) It can be written as (A), where A is a valid string.
iv) You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
For example, if s = "()))", you can insert an opening parenthesis to be "(()))" or a closing parenthesis to be "())))".
Return the minimum number of moves required to make s valid.

Example 1:
Input: s = "())"
Output: 1

Example 2:
Input: s = "((("
Output: 3

Constraints:
1 <= s.length <= 1000
s[i] is either '(' or ')'
 */

package algorithms.leetcode.medium;

import java.util.Stack;

public class MinimumAddToFormValidParentheses {
    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(ch);
            else if (ch == ')') {
                if(!stack.isEmpty() && (stack.peek() == '('))
                    stack.pop();
                else
                    stack.push(ch);
            }
        }
        return stack.size();
    }
}
