package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfUniqueElementsTest {

    @Test
    void testSumOfUniqueElements(){
       int expectedSum = 4;
       int actualSum = SumOfUniqueElements.sumOfUnique(new int[]{1,2,3,2});
       assertEquals(expectedSum, actualSum);
    }
}
