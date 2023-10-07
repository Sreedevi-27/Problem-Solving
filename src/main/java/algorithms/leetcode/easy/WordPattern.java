package algorithms.leetcode.easy;
/*
290. Word Pattern
EASY

Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false

Constraints:
1 <= pattern.length <= 300
pattern contains only lower-case English letters.
1 <= s.length <= 3000
s contains only lowercase English letters and spaces ' '.
s does not contain any leading or trailing spaces.
All the words in s are separated by a single space.
 */
import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int patternLength = pattern.length();
        if(words.length != patternLength)
            return false;

        Map<Character,String> patternMap = new HashMap<>();
        for(int i=0; i<patternLength; i++){
            char c = pattern.charAt(i);
            String arrayElement = words[i];
            if(patternMap.containsKey(c) && !patternMap.get(c).equals(arrayElement))
                return false;
            else if(!patternMap.containsKey(c) && patternMap.containsValue(arrayElement))
                return false;
            else
                patternMap.put(c, arrayElement);
        }

        return true;
    }
}
