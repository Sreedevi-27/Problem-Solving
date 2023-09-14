package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNestingDepthTest {
    @Test
    void testMaximumNestingDepth(){
        int expectedDepth = 3;
        int actualDepth = MaximumNestingDepth.maxDepth("(1+(2*3)+((8)/4))+1");
        assertEquals(expectedDepth, actualDepth);
    }

}