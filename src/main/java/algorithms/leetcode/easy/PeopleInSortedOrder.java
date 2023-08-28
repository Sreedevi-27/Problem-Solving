package algorithms.leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

public class PeopleInSortedOrder {
    public static String[] sortPeople(String[] names, int[] heights){
        int arrayLength = names.length;
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        String[] sortedArray = new String[arrayLength];

        for(int i=0; i<arrayLength; i++){
            treeMap.put(heights[i], names[i]);
        }

        int j=arrayLength-1;
        for(Map.Entry<Integer, String> value : treeMap.entrySet()){
            sortedArray[j--] = value.getValue();
        }
        return sortedArray;
    }
}
