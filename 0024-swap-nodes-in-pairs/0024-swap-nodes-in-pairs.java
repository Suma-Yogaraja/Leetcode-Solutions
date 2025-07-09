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
    public ListNode swapPairs(ListNode head) {
        ListNode zero=new ListNode(0);
        zero.next=head;
        ListNode start=zero;
        
        while(zero.next!=null && zero.next.next!=null){
            ListNode first=zero.next;
            ListNode second=zero.next.next;
            ListNode temp=second.next;
            zero.next=second;
            second.next=first;
            first.next=temp;
            zero=first;
        }
        return start.next;
        
    }
}