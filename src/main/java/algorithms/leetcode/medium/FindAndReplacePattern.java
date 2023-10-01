package algorithms.leetcode.medium;
/*
890. Find and Replace Pattern
MEDIUM

Given a list of strings words and a string pattern, return a list of words[i] that match pattern. You may return the
answer in any order. A word matches the pattern if there exists a permutation of letters p so that after replacing every
letter x in the pattern with p(x), we get the desired word. Recall that a permutation of letters is a bijection
from letters to letters: every letter maps to another letter, and no two letters map to the same letter.

Example 1:
Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
Output: ["mee","aqq"]
Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
"ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation, since a and b map to the same letter.

Example 2:
Input: words = ["a","b","c"], pattern = "a"
Output: ["a","b","c"]

Constraints:
1 <= pattern.length <= 20
1 <= words.length <= 50
words[i].length == pattern.length
pattern and words[i] are lowercase English letters.

 */
import java.util.*;

public class FindAndReplacePattern {
    public static List<String> findAndRepplace(List<String> words, String pattern) {
        List<String> finalList = new ArrayList<>();
        Map<Character, List<Integer>> patternFreqs = createMapObj(pattern, new LinkedHashMap<>());

        for(String word : words){
            Map<Character, List<Integer>> wordFreqs = createMapObj(word, new LinkedHashMap<>());
            Iterator<List<Integer>> patternFreqsIterator = patternFreqs.values().iterator();
            Iterator<List<Integer>> wordFreqsIterator = wordFreqs.values().iterator();
            boolean flag = true;
            while(patternFreqsIterator.hasNext() && wordFreqsIterator.hasNext()){
               if(!patternFreqsIterator.next().equals(wordFreqsIterator.next())){
                   flag = false;
               }
            }
            if(flag) finalList.add(word);
        }

        return finalList;
    }

    public static  Map<Character, List<Integer>> createMapObj(String word, LinkedHashMap<Character, List<Integer>> wordFreqs){
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            List<Integer> list;
            if(wordFreqs.containsKey(ch)){
                list = wordFreqs.get(ch);
            } else{
                list = new ArrayList<>();
            }
            list.add(i);
            wordFreqs.put(ch, list);
        }
        return wordFreqs;
    }
}
