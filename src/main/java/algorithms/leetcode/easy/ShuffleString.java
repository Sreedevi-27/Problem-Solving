package algorithms.leetcode.easy;
/*
1528. Shuffle String
EASY

You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the
character at the ith position moves to indices[i] in the shuffled string.Return the shuffled string.

Example 1:
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

Example 2:
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.

Constraints:
s.length == indices.length == n
1 <= n <= 100
s consists of only lowercase English letters.
0 <= indices[i] < n
All values of indices are unique.
 */

import java.util.TreeMap;

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
//        String shuffledString = "";
//        TreeMap<Integer,Character> pair = new TreeMap<>();
//        for(int i=0; i<s.length(); i++){
//            char c = s.charAt(i);
//            pair.put(indices[i], c);
//        }
//        for(int i=0; i<pair.size(); i++){
//            shuffledString += pair.get(i);
//        }
//        return shuffledString;

        char[] shuffledString = new char[indices.length];
        for(int i=0; i<indices.length; i++){
            int index = indices[i];
            shuffledString[index] = s.charAt(i);
        }
        return new String(shuffledString);
    }
}
