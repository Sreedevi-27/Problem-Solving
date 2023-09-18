package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    @Test
    void testReverseString(){
        String expectedReversedString = "b example good a";
        String actualReversedString = ReverseWordsInAString.reverseWords("a good   example b");
        assertEquals(expectedReversedString, actualReversedString);
    }
}