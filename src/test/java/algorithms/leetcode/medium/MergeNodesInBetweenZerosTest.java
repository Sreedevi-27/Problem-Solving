package algorithms.leetcode.medium;

import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeNodesInBetweenZerosTest {
    @Test
    void testMergeNodes() {
        int[] inputArray = new int[]{0, 3, 1, 0, 4, 5, 2, 0};
        int[] expectedArray = new int[]{4, 11};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = MergeNodesInBetweenZeros.mergeNodes(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    void withThreeNodes(){
        int[] inputArray = new int[]{0,1,0};
        int[] expectedArray = new int[]{1};
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode returnNode = MergeNodesInBetweenZeros.mergeNodes(inputNode);
        int[] actualArray = operations.convertNodeToArray(returnNode);
        assertArrayEquals(expectedArray, actualArray);
    }
}