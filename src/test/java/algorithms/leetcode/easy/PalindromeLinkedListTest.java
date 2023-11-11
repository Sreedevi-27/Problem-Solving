package algorithms.leetcode.easy;

import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    void testPalindrome() {
        int[] inputArray = new int[]{1,2,3,3,2,1};
        boolean expected = true;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        boolean actual = PalindromeLinkedList.isPalindrome(inputNode);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfNotPalindrom() {
        int[] inputArray = new int[]{1,3};
        boolean expected = false;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        boolean actual = PalindromeLinkedList.isPalindrome(inputNode);
        assertEquals(expected, actual);
    }

    @Test
    void checkWithOneNode() {
        int[] inputArray = new int[]{1};
        boolean expected = true;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        boolean actual = PalindromeLinkedList.isPalindrome(inputNode);
        assertEquals(expected, actual);
    }

}