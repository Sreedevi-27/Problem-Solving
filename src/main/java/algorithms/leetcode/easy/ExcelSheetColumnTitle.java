package algorithms.leetcode.easy;
/*
168. Excel Sheet Column Title
EASY

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"

Constraints:
1 <= columnNumber <= 231 - 1
 */

public class ExcelSheetColumnTitle {
    private static final byte ALPHABETS_COUNT = 26;

    public static String convertToTitle(int columnNumber) {
        StringBuilder columnTitle = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = columnNumber % ALPHABETS_COUNT;
            columnNumber /= ALPHABETS_COUNT;
            columnTitle.append((remainder == 0) ? 'Z' : (char) ('A' - 1 + remainder));
            if (remainder == 0) columnNumber--;
        }

        return columnTitle.reverse().toString();
    }
}
