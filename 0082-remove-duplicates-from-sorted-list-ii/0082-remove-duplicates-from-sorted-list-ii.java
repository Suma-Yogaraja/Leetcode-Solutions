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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=head;
        ListNode nextNode=curr;
        boolean flag=false;
        while(curr!=null){
            nextNode=curr.next;
            while(nextNode!=null && curr.val==nextNode.val){
                nextNode=nextNode.next;
                flag=true;
            }
            if(flag){
                prev.next=nextNode;
                flag=false;
            }
            else{
                prev.next=curr;
                prev=curr;
            }
            curr=nextNode;
        }
        return dummy.next;
    }
}