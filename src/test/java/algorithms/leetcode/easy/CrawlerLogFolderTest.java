package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrawlerLogFolderTest {
    @Test
    void testMinOperations(){
        int expectedMinOperations = 3;
        int actualMinOperations = CrawlerLogFolder.minOperations(new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"});
        assertEquals(expectedMinOperations, actualMinOperations);
    }

    @Test
    void testWithSameFolder(){
        int expectedMinOperations = 0;
        int actualMinOperations = CrawlerLogFolder.minOperations(new String[]{"./", "../", "./"});
        assertEquals(expectedMinOperations, actualMinOperations);
    }
}