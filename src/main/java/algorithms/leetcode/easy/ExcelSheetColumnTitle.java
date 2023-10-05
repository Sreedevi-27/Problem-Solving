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
    public static String convertToTitle(int columnNumber) {
        StringBuffer columnTitle = new StringBuffer();
        int remainder = columnNumber;
        while(columnNumber>26){
            remainder = columnNumber%26;
            if(remainder==0){
                columnNumber = columnNumber-1;
                remainder = columnNumber%26;
                columnTitle.append((char)(remainder+65));
            }else
                columnTitle.append((char)(remainder+64));
            columnNumber /= 26;
        }
        columnTitle.append((char)(columnNumber+64));
        return columnTitle.reverse().toString();
    }
}
