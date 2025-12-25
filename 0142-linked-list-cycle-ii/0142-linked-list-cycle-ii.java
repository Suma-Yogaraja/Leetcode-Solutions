/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //use fast and slow pointer to find existence of cycle,then re intialise slow to head
        if(head==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            //detect cycle first
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //exists cycle
                slow=head;
                while(slow!=fast){
                    fast=fast.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}