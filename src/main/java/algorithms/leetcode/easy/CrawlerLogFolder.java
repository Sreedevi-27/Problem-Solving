package algorithms.leetcode.easy;

import java.util.Stack;

public class CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int minOperations=0;
        for(String log : logs){
            if(minOperations!=0 && log.equals("../"))
                minOperations--;
            else if(!log.startsWith("."))
                minOperations++;
        }
        return minOperations;
    }
}
