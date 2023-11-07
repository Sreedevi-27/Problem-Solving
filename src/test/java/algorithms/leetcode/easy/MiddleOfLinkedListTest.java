package algorithms.leetcode.easy;
import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class MiddleOfLinkedListTest {
    @Test
    void testWithOddNodeSize(){
        int[] inputArray = new int[]{1,2,3,4,5};
        int[] expectedArray = new int[]{3,4,5};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = MiddleOfLinkedList.middleNode(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithOddEvenSize() {
        int[] inputArray = new int[]{1, 2, 3, 4, 5, 6};
        int[] expectedArray = new int[]{4, 5, 6};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = MiddleOfLinkedList.middleNode(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithSingeNode() {
        int[] inputArray = new int[]{1};
        int[] expectedArray = new int[]{1};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = MiddleOfLinkedList.middleNode(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }
}