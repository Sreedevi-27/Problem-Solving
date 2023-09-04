package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfSquaresTest {
    @Test
    void testSumOfSquares(){
        int expectedSum = 21;
        int actualSum = SumOfSquares.sumOfSquares(new int[]{1,2,3,4});
        assertEquals(expectedSum, actualSum);
    }
}