package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstPalindromeInArrayTest {
    @Test
    void testFirstPalindrome(){
        String expectedPalindromeString = "ada";
        String actualPalindromeString = FirstPalindromeInArray.firstPalindrome(new String[]{"abc","car","ada","racecar","cool"});
        assertEquals(expectedPalindromeString, actualPalindromeString);
    }

    @Test
    void testWithNoPalindrome(){
        String expectedPalindromeString = "";
        String actualPalindromeString = FirstPalindromeInArray.firstPalindrome(new String[]{"def","ghi"});
        assertEquals(expectedPalindromeString, actualPalindromeString);
    }
}