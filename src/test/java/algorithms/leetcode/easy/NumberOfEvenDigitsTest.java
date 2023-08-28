package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfEvenDigitsTest {

    @Test
    void testNumberOfEvenDigits(){
        int expectedCount = 2;
        int actualCount = NumberOfEvenDigits.findNumbers(new int[]{12,345,2,6,7896});
        assertEquals(expectedCount, actualCount);
    }
}
