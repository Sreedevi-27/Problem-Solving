package algorithms.leetcode.easy;

import algorithms.leetcode.medium.MergeNodesInBetweenZeros;
import algorithms.leetcode.utility.LinkedListUtility;
import algorithms.leetcode.utility.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    void testLinkedListWithNoCycle(){
        int[] inputArray = new int[]{3,2,0,-4};
        boolean expected = false;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        boolean actual = LinkedListCycle.hasCycle(inputNode);
        assertEquals(expected, actual);
    }

    @Test
    void testLinkedListWithCycle(){
        int[] inputArray = new int[]{3,2,0,-4,7,6};
        boolean expected = true;
        LinkedListUtility operations = new LinkedListUtility();
        ListNode inputNode = operations.convertArrayToNode(inputArray);
        ListNode startPoint = inputNode;
        ListNode endpoint = inputNode;
        while(endpoint.next!=null)
            endpoint = endpoint.next;

       for(int i=0; i<3; i++)
            startPoint = startPoint.next;

        endpoint.next = startPoint;
        boolean actual = LinkedListCycle.hasCycle(inputNode);
        assertEquals(expected, actual);
    }
}