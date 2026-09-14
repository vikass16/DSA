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
        if(head.next == null) return null;
        ListNode curr = head;
        ListNode temp = head;

        int i=1; 
        while(i<=n){
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
        if(temp.next != null){
            temp.next = temp.next.next;
        }

        return head;
    }
}