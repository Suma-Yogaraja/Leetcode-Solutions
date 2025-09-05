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
    public void reorderList(ListNode head) {
        //using fast and slow pointer, will find the middle of linked list
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       // System.out.println(slow.next.val);
        //reverse the secondhalf
        ListNode secondHalf=reverse(slow.next);
        slow.next=null;
        ListNode firstHalf=head;
        //merge first and second
        while(secondHalf!=null ){
            ListNode nextNode=firstHalf.next;
            firstHalf.next=secondHalf;
            secondHalf=secondHalf.next;
            firstHalf.next.next=nextNode;
            firstHalf = nextNode;

            
        }
    }
   private ListNode reverse(ListNode head){
     ListNode prev=null;
     ListNode curr=head;
     while(curr!=null){
        ListNode nextNode=curr.next;
        curr.next=prev;
        prev=curr;
        curr=nextNode;
     }
     return prev;
   }
}