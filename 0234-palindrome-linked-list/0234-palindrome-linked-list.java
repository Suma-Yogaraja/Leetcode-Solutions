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
        //thinking of finding mid and then reverse second part and check
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=slow;
        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(prev.val);
        prev.next=null;
        ListNode dummy=new ListNode();
        ListNode curr=slow;
        dummy.next=curr;
        prev=null;
        while(curr!=null){
            ListNode nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            
        }
        while(head!=null){
            if(head.val!=prev.val)
                return false;
            head=head.next;
            prev=prev.next;
        }
        return true;
    }
}