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
        ListNode current=head;
        //for each elemnt in the list iterate till end
        while (current!= null && current.next != null) {
            //check whether head node and head next nodes are equal
            if (current.val == current.next.val) {
                //if equal ,delete head next node which id duplicate
                current.next=current.next.next;
            }
            else
                current=current.next;
        }
        return head;
    }
}