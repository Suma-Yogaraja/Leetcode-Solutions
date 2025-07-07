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
    public ListNode middleNode(ListNode head) {
        //declare fast and slow pointer to head of node
        ListNode slow=head;
        ListNode fast=head;

        //move fast pointer twice the speed of slow untill fast becomes null
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        
        //return slow
        return slow;

        
    }
}