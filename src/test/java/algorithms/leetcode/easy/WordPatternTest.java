package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {

    @Test
    void testWordPattern(){
        boolean expectedMatch = true;
        boolean actualMatch = WordPattern.wordPattern("abba", "dog cat cat dog");
        assertEquals(expectedMatch, actualMatch);
    }

    @Test
    void testWithSameWordsInString(){
        boolean expectedMatch = false;
        boolean actualMatch = WordPattern.wordPattern("abba", "dog dog dog dog");
        assertEquals(expectedMatch, actualMatch);
    }
}