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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(left==right|| head==null)
            return head;
        ListNode prev=dummy;
        for(int i=1;i<left;i++){
            prev=prev.next;
        }
        ListNode curr=prev.next;
        ListNode prevSub=null;
        for(int i=0;i<(right-left+1);i++){
            ListNode nextNode=curr.next;
            curr.next=prevSub;
            prevSub=curr;
            curr=nextNode;
        }

       // System.out.println(prevSub.val + " " + curr.val);
        prev.next.next=curr;
        prev.next=prevSub;
        return dummy.next;


    }

}
