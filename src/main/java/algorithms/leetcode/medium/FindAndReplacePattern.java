package algorithms.leetcode.medium;

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
