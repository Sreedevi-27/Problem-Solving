package algorithms.leetcode.easy;

import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTest {
    @Test
    void reverseList(){
        int[] inputArray = new int[]{1,2,3,4};
        int[] expectedArray = new int[]{4,3,2,1};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = ReverseLinkedList.reverseList(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithNoNodes(){
        int[] inputArray = new int[]{};
        int[] expectedArray = new int[]{};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = ReverseLinkedList.reverseList(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testSingleNode(){
        int[] inputArray = new int[]{5};
        int[] expectedArray = new int[]{5};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = ReverseLinkedList.reverseList(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }
}