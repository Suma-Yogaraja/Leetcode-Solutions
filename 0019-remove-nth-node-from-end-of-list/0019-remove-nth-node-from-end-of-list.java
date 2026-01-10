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
        //use fast and slow ptr
        //assign fast ahead of n steps
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast=head;
        // fast.next=head;
        ListNode prev=dummy;
       
        if(head.next==null && n<=1)
            return null;
        while(fast!=null && n>=1){
            fast=fast.next;
            n--;
        }
        while(fast!=null){
            prev=head;
            head=head.next;
            fast=fast.next;
        }
        //we have prev =3;slow=4;
        if(head.next!=null){
        prev.next=head.next;
        }
        else{

            prev.next=null;
        }
        return dummy.next;
    }
}