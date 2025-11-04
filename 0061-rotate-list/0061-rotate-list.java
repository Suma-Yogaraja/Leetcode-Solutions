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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0 || head.next==null)
            return head;
        int n=0;
        ListNode dummy=new ListNode(0);
        ListNode prev=null;
        dummy.next=head;
        ListNode fast=head;
        ListNode slow=dummy;
        while(fast!=null){
            fast=fast.next;
            n++;
        }
        k=k%n;
        if(k==0)
            return head;
        fast=head;
        int i=0;
        while(i<k){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            prev=fast;
            fast=fast.next;
            slow=slow.next;
        }
        // System.out.println(slow.val);
        ListNode newhead=slow.next;
        slow.next=null;
        prev.next=head;
        return newhead;
    }
}