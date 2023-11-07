package algorithms.leetcode.easy;
/*
876. Middle of the Linked List
EASY

Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

Example 1:
Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.

Constraints:
The number of nodes in the list is in the range [1, 100].
1 <= Node.val <= 100
 */

import algorithms.leetcode.utility.ListNode;

public class MiddleOfLinkedList {
    public static ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        count = count/2;

        while(head != null && count-->0){
            head = head.next;
        }
        return head;
    }
}
