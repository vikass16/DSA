/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }

        ListNode curr = head; // This will go exactly at the end
        ListNode temp = head; // this will go where the node to be removed

        int i = 1;
        while(i <= n){
            curr = curr.next;
            i++;
        }

        if(curr == null){
            return head.next;
        }

        while(curr.next != null){
            curr = curr.next;
            temp = temp.next;
        }

        if(temp != null){
            temp.next = temp.next.next;
        }
        return head;
    }
}