package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeopleInSortedOrderTest {

    @Test
    void testSortedOrder(){
        String[] expectedArray = {"Mary","Emma","John"};
        String[] actualArray = PeopleInSortedOrder.sortPeople(new String[]{"Mary","John","Emma"}, new int[]{180,165,170});
        assertEquals(Arrays.toString(expectedArray), Arrays.toString(actualArray));
    }
}
