package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareRootTest {
    @Test
    void testPerfectSqure(){
        int expectedValue = 8;
        int actualValue = SquareRoot.mySqrt(64);
        assertEquals(expectedValue, actualValue);
    }

    @Test
    void testWithLongValue(){
        int expectedValue = 46340;
        int actualValue = SquareRoot.mySqrt(2147395600);
        assertEquals(expectedValue, actualValue);
    }
}