/*
500. Keyboard Row
EASY

Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of
American keyboard like the image below.

In the American keyboard:
the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

Example 1:
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]

Example 2:
Input: words = ["omk"]
Output: []

Example 3:
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]

Constraints:
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).
 */

package algorithms.leetcode.easy;

import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        ArrayList<String> lettersInSameRow = new ArrayList<>();
        Set<Character> firstRow = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> secondRow = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> thirdRow = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

        for(String word : words){
            String wordInLowercase = word.toLowerCase();
            Set<Character> fixRow;
            char firstChar = wordInLowercase.charAt(0);
            if(firstRow.contains(firstChar))
                fixRow = firstRow;
            else if(secondRow.contains(firstChar))
                fixRow = secondRow;
            else
                fixRow = thirdRow;

            if(isPartOfWord(word, fixRow))
                lettersInSameRow.add(word);
        }

        return lettersInSameRow.toArray(new String[0]);
    }

    public static boolean isPartOfWord(String word, Set<Character> fixRow){
        for(int j=0; j<word.length(); j++){
            if(!fixRow.contains(word.charAt(j)))
                return false;
        }
        return true;
    }
}
