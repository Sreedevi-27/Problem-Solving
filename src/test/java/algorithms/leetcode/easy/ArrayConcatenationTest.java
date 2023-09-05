package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayConcatenationTest {
    @Test
    public void testArrayConcatenation(){
        int[] expectedConcatenatedArray = {1,2,1,1,2,1};
        int[] actualConcatenatedArray = ArrayConcatenation.getConcatenation(new int[]{1,2,1});
        assertEquals(Arrays.toString(expectedConcatenatedArray), Arrays.toString(actualConcatenatedArray));
    }
}