package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordStartsWithPrefixTest {
    @Test
    void testGoodTriplets(){
        int expectedCountOfTriplets = 2;
        int actualCountOfTriplets = WordStartsWithPrefix.prefixCount(new String[]{"pay","attention","practice","attend"}, "at");
        assertEquals(expectedCountOfTriplets, actualCountOfTriplets);
    }
}