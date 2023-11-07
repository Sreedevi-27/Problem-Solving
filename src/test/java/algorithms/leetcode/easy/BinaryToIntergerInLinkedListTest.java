package algorithms.leetcode.easy;

import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToIntergerInLinkedListTest {
    @Test
    void testWithBinaryNumbers(){
        int[] inputArray = new int[]{1,0,1};
        int expectedInteger = 5;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        int actualInteger = BinaryToIntergerInLinkedList.getDecimalValue(inputNode);
        assertEquals(expectedInteger, actualInteger);
    }

    @Test
    void testWithManyNodes() {
        int[] inputArray = new int[]{0,1,0,1,1,0,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,1};
        int expectedInteger = 2957087;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        int actualInteger = BinaryToIntergerInLinkedList.getDecimalValue(inputNode);
        assertEquals(expectedInteger, actualInteger);
    }

    @Test
    void testWithSingeNode() {
        int[] inputArray = new int[]{0};
        int expectedInteger = 0;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        int actualInteger = BinaryToIntergerInLinkedList.getDecimalValue(inputNode);
        assertEquals(expectedInteger, actualInteger);
    }
}