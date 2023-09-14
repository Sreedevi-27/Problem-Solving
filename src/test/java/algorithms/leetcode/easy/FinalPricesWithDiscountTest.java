package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FinalPricesWithDiscountTest {
    @Test
    void testFinalPrices(){
        int[] expectedFinalPrices = {4,2,4,2,3};
        int[] actualFinalPrices = FinalPricesWithDiscount.finalPrices(new int[]{8,4,6,2,3});
        assertEquals(Arrays.toString(expectedFinalPrices), Arrays.toString(actualFinalPrices));
    }
}