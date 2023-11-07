package algorithms.leetcode.easy;
/*
206. Reverse Linked List
EASY

Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []

Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
 */


import algorithms.leetcode.utility.ListNode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode!=null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}