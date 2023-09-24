package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAddToFormValidParenthesesTest {
    @Test
    void testValidParentheses(){
        int expectedMinimumCount = 3;
        int actualMinimumCount = MinimumAddToFormValidParentheses.minAddToMakeValid("(((");
        assertEquals(expectedMinimumCount, actualMinimumCount);
    }
}