package algorithms.leetcode.utility;

public class LinkedListUtility {
    public ListNode convertArrayToNode(int[] arr){
        ListNode head = null;
        ListNode temp = null;

        if(arr.length>0){
            head = new ListNode(arr[0]);
            temp = head;
        }
        for(int i=1; i< arr.length; i++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }

    public int[] convertNodeToArray(ListNode head){
        int size = sizeOfLinkedList(head);
        int arr[] = new int[size];
        ListNode temp = head;
        for(int i=0; i<size; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        return arr;
    }

    public int sizeOfLinkedList(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}