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
import java.util.Objects;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int patternLength = pattern.length();
        if (words.length != patternLength)
            return false;

        Map<Character, Integer> patternMap = new HashMap<>();
        Map<String, Integer> wordMap = new HashMap<>();
        for (int i = 0; i < patternLength; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (patternMap.size() != wordMap.size()) return false;
            if (patternMap.containsKey(c) && !wordMap.containsKey(word)) return false;
            if (!patternMap.containsKey(c) && wordMap.containsKey(word)) return false;
            if (patternMap.containsKey(c) && wordMap.containsKey(word) && !Objects.equals(patternMap.get(c), wordMap.get(word)))
                return false;

            patternMap.put(c, i);
            wordMap.put(word, i);
        }

        return true;
    }
}
