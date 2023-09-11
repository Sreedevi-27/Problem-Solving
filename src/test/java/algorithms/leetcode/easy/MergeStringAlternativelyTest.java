package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringAlternativelyTest {
    @Test
    void testMergeString(){
        String expectedMergedString = "apbqrs";
        String actualMergedString = MergeStringAlternatively.mergeAlternately("ab", "pqrs");
        assertEquals(actualMergedString,actualMergedString);
    }
}