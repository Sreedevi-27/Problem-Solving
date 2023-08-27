package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestElementOnRightSideTest {

    @Test
    void replaceElements() {
        int[] expected = {18,6,6,6,1,-1};
        GreatestElementOnRightSide greatestElementOnRightSide = new GreatestElementOnRightSide();
        int[] actual = greatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }
}