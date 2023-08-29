package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersWithEvenDigitsTest {

    @Test
    void testEvenDigits(){
        int expectedCount = 2;
        int actualCount = NumbersWithEvenDigits.findNumbers(new int[]{12,345,2,6,7896});
        assertEquals(expectedCount, actualCount);
    }

    @Test
    void testAllOddDigits(){
        int expectedCount = 0;
        int actualCount = NumbersWithEvenDigits.findNumbers(new int[]{173,345,979,783,789});
        assertEquals(expectedCount, actualCount);
    }
}
