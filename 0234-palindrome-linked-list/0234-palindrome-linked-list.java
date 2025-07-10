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
    public boolean isPalindrome(ListNode head) {
        //get middle of element usinf fast ans slow pointer
        ListNode dummy=head; 
        ListNode slow=head;
        ListNode fast=head;
        int n=1;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
       // System.out.println(slow.val);
        dummy=slow;
        ListNode curr=dummy;
        ListNode prev=null;

        //reverse either first or second,here im reversing second half
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
       // System.out.println(prev.val);
    
        //now check head with second half(prev is head of second half)
        while(prev!=null){
            if(head.val!=prev.val){
                return false;
            }
            head=head.next;
            prev=prev.next;
        }

        return true;
    }
}