package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAndReplacePatternTest {
    @Test
    void testFindAndreplace(){
        List<String> expectedList = Arrays.asList("mee", "aqq");
        List<String> actualList = FindAndReplacePattern.findAndRepplace(Arrays.asList("abc","deq","mee","aqq","dkd","ccc"), "abb");
        assertEquals(expectedList, actualList);
    }

    @Test
    void singleOccurence(){
        List<String> expectedList = Arrays.asList("a", "b", "c");
        List<String> actualList = FindAndReplacePattern.findAndRepplace(Arrays.asList("a","b","c"), "a");
        assertEquals(expectedList, actualList);
    }

    @Test
    void test1(){
        List<String> expectedList = Arrays.asList("abab","dede");
        List<String> actualList = FindAndReplacePattern.findAndRepplace(Arrays.asList("badc","abab","dddd","dede","yyxx"), "baba");
        assertEquals(expectedList, actualList);
    }
}