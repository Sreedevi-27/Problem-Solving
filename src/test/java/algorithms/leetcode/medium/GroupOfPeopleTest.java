package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfPeopleTest {
    @Test
    void testGroupOfPeople(){
        List<List<Integer>> expectedGroupPeople = Arrays.asList(Arrays.asList(5), Arrays.asList(0,1,2), Arrays.asList(3,4,6));
        List<List<Integer>> actualGroupPeople = GroupOfPeople.groupThePeople(new int[]{3,3,3,3,3,1,3});
        assertEquals(expectedGroupPeople, actualGroupPeople);
    }
}