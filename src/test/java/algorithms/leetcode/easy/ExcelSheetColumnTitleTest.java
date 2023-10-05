package algorithms.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitleTest {
    @Test
    void testTitle(){
        String expectedTitle = "ZY";
        String actualTitle = ExcelSheetColumnTitle.convertToTitle(701);
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    void testLargeTitle(){
        String expectedTitle = "TWDBXZ";
        String actualTitle = ExcelSheetColumnTitle.convertToTitle(248210274);
        assertEquals(expectedTitle, actualTitle);
    }

}