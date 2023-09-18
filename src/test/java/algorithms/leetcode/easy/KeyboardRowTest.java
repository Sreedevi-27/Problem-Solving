package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRowTest {
    @Test
    void checkKeybboardRow(){
        String[] expecectedArray = {"Alaska","Dad"};
        String[] actualArray = KeyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        assertEquals(Arrays.toString(expecectedArray), Arrays.toString(actualArray));
    }

    @Test
    void checkWithSingleCharInArray(){
        String[] expecectedArray = {"a","b"};
        String[] actualArray = KeyboardRow.findWords(new String[]{"a", "b"});
        assertEquals(Arrays.toString(expecectedArray), Arrays.toString(actualArray));
    }
}