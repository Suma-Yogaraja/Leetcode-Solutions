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
    public ListNode oddEvenList(ListNode head) {
        
        //check for edge case
        if(head==null || head.next==null)
            return head;
            ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=even;
        //change link of odd and even
        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=even.next.next;
            even=even.next;
        }

        //noe link tail of odd linked list to head of even 
        odd.next=evenHead;
        return head;

        }

    
}