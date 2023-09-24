package algorithms.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {
    @Test
    void testCompression(){
        int expectedLength = 6;
        int actualLength = StringCompression.compressString(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'});
        assertEquals(expectedLength, actualLength);
    }

    @Test
    void testWithSingleChar(){
        int expectedLength = 1;
        int actualLength = StringCompression.compressString(new char[]{'a'});
        assertEquals(expectedLength, actualLength);
    }

}