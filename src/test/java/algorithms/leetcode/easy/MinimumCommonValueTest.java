package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumCommonValueTest {
    @Test
    void testCommonValue(){
        int expectedValue = 2;
        int actualValue = MinimumCommonValue.getCommon(new int[]{1,1,2}, new int[]{2,4});
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testWithNoCommonValue(){
        int expectedValue = -1;
        int actualValue = MinimumCommonValue.getCommon(new int[]{5}, new int[]{2,4});
        assertEquals(expectedValue, actualValue);
    }
}