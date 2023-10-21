package algorithms.leetcode.medium;
/*
92. Reverse Linked List II
MEDIUM

Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list
from position left to position right, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 1:
Input: head = [5], left = 1, right = 1
Output: [5]

Constraints:
The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n

 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int x = left;
        if (head.next == null)
            return head;
        ListNode tempNode = head;
        ListNode nearLeft = tempNode;
        while (left > 1) {
            nearLeft = tempNode;
            tempNode = tempNode.next;
            left--;
            right--;
        }

        ListNode currNode = tempNode;
        ListNode prevNode = null;
        while (right > 0) {
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            right--;
        }

        nearLeft.next = prevNode;
        tempNode.next = currNode;
        if (x == 1) return prevNode;
        return head;
    }
}