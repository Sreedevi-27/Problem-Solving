package algorithms.leetcode.easy;
/*
21. Merge Two Sorted Lists
EASY

You are given the heads of two sorted linked lists list1 and list2. Merge the two lists into one sorted list.
The list should be made by splicing together the nodes of the first two lists. Return the head of the merged linked list.

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */

public class MergeTwoSortedLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode finalNode = new ListNode(-1);
        ListNode temp = finalNode;

        while(list1 != null && list2 != null){
            if(list1.val>=list2.val){
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            } else{
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
        }

        while(list2!=null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }

        while(list1!=null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        return finalNode.next;
    }
}
