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
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        int i=0;
        while(fast!=null && i<n){
            fast=fast.next;
            i++;   
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        // System.out.println(prev.val);
        if(prev==null)
            return head.next;
        prev.next=slow.next;
        slow.next=null;
        return head;
    }
}