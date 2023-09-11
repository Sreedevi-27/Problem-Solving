package algorithms.leetcode.medium;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    void testReverseString(){
        String expectedReversedString = "b example good a";
        String actualReversedString = ReverseWordsInAString.reverseWords("a good   example b");
        assertEquals(expectedReversedString, actualReversedString);
    }
}