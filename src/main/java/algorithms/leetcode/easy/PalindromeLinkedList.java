package algorithms.leetcode.easy;
/*
234. Palindrome Linked List
EASY

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

Constraints:
The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 */

import algorithms.leetcode.utility.ListNode;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        ListNode original = new ListNode(-1);
        ListNode org = original;
        while(temp != null){
            ListNode n = new ListNode(temp.val);
            original.next = n;
            original = original.next;
            temp = temp.next;
        }

        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        if(checkIfPalindrome(org.next, prevNode)) return true;

        return false;
    }

    public static boolean checkIfPalindrome(ListNode temp, ListNode rev) {
        while(temp!=null && rev!=null){
            if(temp.val != rev.val) return false;
            temp = temp.next;
            rev = rev.next;
        }
        return true;
    }
}
