package algorithms.leetcode.easy;
/*
1290. Convert Binary Number in a Linked List to Integer
EASY

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1.
The linked list holds the binary representation of a number.Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.

Example 1:
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10

Example 2:
Input: head = [0]
Output: 0

Constraints:
The Linked List is not empty.
Number of nodes will not exceed 30.
Each node's value is either 0 or 1.
 */

import algorithms.leetcode.utility.ListNode;

public class BinaryToIntergerInLinkedList {
    public static int getDecimalValue(ListNode head) {
        int count = getCount(head)-1;
        ListNode traverseNode = head;
        int integerNumber = 0;
        while(traverseNode!=null){
            integerNumber += (traverseNode.val * Math.pow(2, count--));
            traverseNode = traverseNode.next;
        }
        return integerNumber;
    }

    public static int getCount(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}
