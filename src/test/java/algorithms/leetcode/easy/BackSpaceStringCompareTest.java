package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompareTest {
    @Test
    void testBackSpace(){
        boolean expectedCompareResult = true;
        boolean actualCompareResult = BackSpaceStringCompare.backspaceCompare("ab##", "c#d#");
        assertEquals(expectedCompareResult, actualCompareResult);
    }

    @Test
    void testStringStaringWithBackspaceCharacter(){
        boolean expectedCompareResult = false;
        boolean actualCompareResult = BackSpaceStringCompare.backspaceCompare("#cd", "bh");
        assertEquals(expectedCompareResult, actualCompareResult);
    }
}