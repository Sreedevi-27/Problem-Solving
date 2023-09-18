package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllDuplicatesInArrayTest {

    @Test
    void checkDuplicates(){
        List<Integer> expectedDuplicates = new ArrayList<>(Arrays.asList(2,3));
        List<Integer> actualDuplicates = FindAllDuplicatesInArray.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
        assertEquals(Arrays.toString(new List[]{expectedDuplicates}), Arrays.toString(new List[]{actualDuplicates}));
    }
}