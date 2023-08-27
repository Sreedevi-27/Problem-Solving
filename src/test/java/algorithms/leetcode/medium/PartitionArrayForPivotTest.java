package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionArrayForPivotTest {

    @Test
    void testPartitionArray(){
        int[] expectedArray = {9,5,3,10,10,12,14};
        int[] actualArray = PartitionArrayForPivot.pivotArray(new int[]{9,12,5,10,14,3,10}, 10);
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(actualArray));
    }
}
