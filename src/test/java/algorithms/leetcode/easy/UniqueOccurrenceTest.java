package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniqueOccurrenceTest {
    @Test
    void testUnqiueOccurence(){
        boolean expectedIsUnique = true;
        boolean actualIsUnique = UniqueOccurrence.uniqueOccurrences(new int[]{1,2,2,1,1,3});
        assertEquals(expectedIsUnique, actualIsUnique);
    }
}