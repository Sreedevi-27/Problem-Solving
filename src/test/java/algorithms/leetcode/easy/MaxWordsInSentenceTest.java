package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxWordsInSentenceTest {

    @Test
    void testMaxWordsInSentence(){
        int expectedWords = 6;
        int actualWords = MaxWordsInSentence.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        assertEquals(expectedWords, actualWords);
    }
}
