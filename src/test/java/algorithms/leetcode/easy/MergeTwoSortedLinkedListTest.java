package algorithms.leetcode.easy;

import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedLinkedListTest {
    @Test
    void mergeSortedList(){
        int[] inputArray1 = new int[]{1,2,4};
        int[] inputArray2 = new int[]{1,3,4};
        int[] expectedArray = new int[]{1,1,2,3,4,4};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode1 = operations.convertArrayToNode(inputArray1);
        ListNode inputNode2 = operations.convertArrayToNode(inputArray2);
        ListNode returnNode = MergeTwoSortedLinkedList.mergeTwoLists(inputNode1, inputNode2);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithEmptyNodes() {
        int[] inputArray1 = new int[]{};
        int[] inputArray2 = new int[]{};
        int[] expectedArray = new int[]{};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode1 = operations.convertArrayToNode(inputArray1);
        ListNode inputNode2 = operations.convertArrayToNode(inputArray2);
        ListNode returnNode = MergeTwoSortedLinkedList.mergeTwoLists(inputNode1, inputNode2);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void testWithSingeNode() {
        int[] inputArray1 = new int[]{1};
        int[] inputArray2 = new int[]{3};
        int[] expectedArray = new int[]{1,3};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode1 = operations.convertArrayToNode(inputArray1);
        ListNode inputNode2 = operations.convertArrayToNode(inputArray2);
        ListNode returnNode = MergeTwoSortedLinkedList.mergeTwoLists(inputNode1, inputNode2);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

}