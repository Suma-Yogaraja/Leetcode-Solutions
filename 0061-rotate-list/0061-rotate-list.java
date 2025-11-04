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
        int n=1;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null){
            fast=fast.next;
            n++;
        }
         System.out.println(n);
        k=k%n;
        if(k==0)
            return head;
        for(int i=0;i<(n-k-1);i++){
            slow=slow.next; 
        }
        // System.out.println(slow.val + " : " + fast.val);
        ListNode newhead=slow.next;
        slow.next=null;
        fast.next=head;
        return newhead;
    }
}