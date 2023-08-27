package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementsSumAndDigitSumDiffTest {
    @Test
    void testElementsSumAndDigitSumDiff(){
        int expectedDiff = 9;
        int actualDiff = ElementSumAndDigitSumDiff.differenceOfSum(new int[]{1,15,6,3});
        assertEquals(expectedDiff, actualDiff);
    }
}
