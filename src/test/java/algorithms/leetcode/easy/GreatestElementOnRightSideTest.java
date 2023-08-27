package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestElementOnRightSideTest {
    @Test
    void testReplaceElements() {
        int[] expected = {18,6,6,6,1,-1};
        int[] actual = GreatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}