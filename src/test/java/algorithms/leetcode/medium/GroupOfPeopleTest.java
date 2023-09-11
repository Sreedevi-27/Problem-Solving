package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupOfPeopleTest {
    @Test
    void testGroupOfPeople(){
        List<List<Integer>> expectedGroupPeople = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(5);
        List<Integer> list2 = Arrays.asList(0,1,2);
        List<Integer> list3 = Arrays.asList(3,4,6);
        expectedGroupPeople.add(list1);
        expectedGroupPeople.add(list2);
        expectedGroupPeople.add(list3);
        List<List<Integer>> actualGroupPeople = GroupOfPeople.groupThePeople(new int[]{3,3,3,3,3,1,3});
        assertEquals(expectedGroupPeople, actualGroupPeople);
    }
}