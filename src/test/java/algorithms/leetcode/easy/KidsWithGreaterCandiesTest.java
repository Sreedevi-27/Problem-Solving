package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithGreaterCandiesTest {
    @Test
    void testGreatestCandies(){
        List<Boolean> expectedKidsWithGreaterCandies = Arrays.asList(true, true, true, false, true);
        List<Boolean> actualKidsWithGreaterCandies = KidsWithGreaterCandies.kidsWithCandies(new int[]{2,3,5,1,3}, 3);
        assertEquals(Arrays.toString(expectedKidsWithGreaterCandies.toArray()),Arrays.toString(actualKidsWithGreaterCandies.toArray()));
    }
}