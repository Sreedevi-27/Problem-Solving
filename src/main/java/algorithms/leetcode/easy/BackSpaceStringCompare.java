/*
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".

Constraints:
1 <= s.length, t.length <= 200
s and t only contain lowercase letters and '#' characters.
 */

package algorithms.leetcode.easy;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        return (checkAfterBackspacing(s).equals(checkAfterBackspacing(t)));
    }

    public static String checkAfterBackspacing(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='#'){
                sb.append(ch);
            } else if(sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
