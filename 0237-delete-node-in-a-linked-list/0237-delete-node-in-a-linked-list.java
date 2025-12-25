/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //delete doesnt mean to literally remove it
        // ListNode duplicate=node;
        ListNode nextNode=node.next;
        ListNode prev=node;
        while(nextNode!=null){
            node.val=nextNode.val;
            prev=node;
            node=nextNode;
            nextNode=nextNode.next;
        }
        prev.next=null;

    }
}