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
    public ListNode swapNodes(ListNode head, int k) {
        //first get the elemnets from begining and end og list using 2 pointer
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        ListNode prevB=dummy;
        int count=0;
        //move fast pointer to k
        for(int i=0;i<k;i++){
            prevB=fast;
            fast=fast.next;
        }
        ListNode first=fast;

        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next;
        }
        //System.out.println(slow.val);
        
            int temp=first.val;
            first.val=slow.next.val;
            slow.next.val=temp;
        
            
        return head;
        
    }
}