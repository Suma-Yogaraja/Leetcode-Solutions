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
        // //time complexity=O(n) n=lengthof linkedlist-length of node
        // //space complexity=O(1)
        // //delete doesnt mean to literally remove it
        // ListNode duplicate=node;

        // ListNode nextNode=node.next;
        // ListNode prev=node;
        // while(nextNode!=null){
        //     node.val=nextNode.val;
        //     prev=node;
        //     node=nextNode;
        //     nextNode=nextNode.next;
        // }
        // prev.next=null;

        //2n way
        node.val=node.next.val;
        node.next=node.next.next;

    }
}