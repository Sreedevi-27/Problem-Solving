package algorithms.leetcode.medium;

import algorithms.leetcode.easy.PalindromeLinkedList;
import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedList2Test {
    @Test
    void reverseFromLeftToRight() {
        int[] inputArray = new int[]{1,2,3,4,5,6,7,8};
        int left = 4;
        int right = 6;
        int[] expectedArray = new int[]{1,2,3,6,5,4,7,8};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode outputNode = ReverseLinkedList2.reverseBetween(inputNode, left, right);
        int[] outputArray = operations.convertNodeToArray(outputNode);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    void testWithOneNode() {
        int[] inputArray = new int[]{1};
        int left = 1;
        int right = 1;
        int[] expectedArray = new int[]{1};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode outputNode = ReverseLinkedList2.reverseBetween(inputNode, left, right);
        int[] outputArray = operations.convertNodeToArray(outputNode);
        assertArrayEquals(expectedArray, outputArray);
    }

    @Test
    void reverseHead() {
        int[] inputArray = new int[]{1,2,3,4,5,7,8,9};
        int left = 1;
        int right = 7;
        int[] expectedArray = new int[]{8,7,5,4,3,2,1,9};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode outputNode = ReverseLinkedList2.reverseBetween(inputNode, left, right);
        int[] outputArray = operations.convertNodeToArray(outputNode);
        assertArrayEquals(expectedArray, outputArray);
    }
}