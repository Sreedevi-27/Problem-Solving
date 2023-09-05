package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleStringTest {
    @Test
    public void testShuffleString(){
        String expectedShuffledString = "leetcode";
        String actualShuffledString = ShuffleString.restoreString("codeleet", new int[]{4,5,6,7,0,2,1,3});
        assertEquals(expectedShuffledString, actualShuffledString);
    }
}