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

import java.util.ArrayList;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        ArrayList<String> lettersInSameRow = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for(int i=0; i<words.length; i++){
            String word = words[i].toLowerCase();
            String fixRow = "";
            if(firstRow.indexOf(word.charAt(0)) != -1)
                fixRow = firstRow;
            else if(secondRow.indexOf(word.charAt(0)) != -1)
                fixRow = secondRow;
            else
                fixRow = thirdRow;

            if(isPartOfWord(word, fixRow))
                lettersInSameRow.add(words[i]);
        }

        return lettersInSameRow.toArray(new String[lettersInSameRow.size()]);
    }

    public static boolean isPartOfWord(String word, String fixRow){
        for(int j=0; j<word.length(); j++){
            int indexOfLetterInWord = fixRow.indexOf(word.charAt(j));
            if(indexOfLetterInWord == -1)
                return false;
        }
        return true;
    }
}
