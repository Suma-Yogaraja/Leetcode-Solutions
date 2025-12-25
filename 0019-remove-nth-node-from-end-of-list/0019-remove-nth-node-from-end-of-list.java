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
        if(head==null)
            return null;
        ListNode duplicate =new ListNode(0);
        duplicate.next=head;
        ListNode slow=duplicate;
        ListNode fast=duplicate;
       while(n>=0 && fast!=null){
            fast=fast.next;
            n--;
       }
        // System.out.println(fast.val);
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        if(slow.next!=null )
            slow.next=slow.next.next;
        // else
        //     slow=null;
        return duplicate.next;

    }
}