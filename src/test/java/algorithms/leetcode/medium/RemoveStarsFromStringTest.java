package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveStarsFromStringTest {

    @Test
    void testRemoveStarts() {
        String expectedStringWithoutStars = "lecoe";
        String actualStringWithoutStarts = RemoveStarsFromString.removeStars("leet**cod*e");
        assertEquals(expectedStringWithoutStars, actualStringWithoutStarts);
    }

    @Test
    void removeAllStars(){
        String expectedStringWithoutStars = "";
        String actualStringWithoutStarts = RemoveStarsFromString.removeStars("erase*****");
        assertEquals(expectedStringWithoutStars, actualStringWithoutStarts);
    }
}