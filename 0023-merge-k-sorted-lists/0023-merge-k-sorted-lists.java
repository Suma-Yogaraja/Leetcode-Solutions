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
    public ListNode mergeKLists(ListNode[] lists) {
        
        if(lists.length==0)
            return null;
        PriorityQueue<ListNode> pq=new PriorityQueue<>(
            (a,b)-> (a.val-b.val)
        );
        // add head of all lists 
        for(ListNode list:lists){
            if(list!=null)
                pq.offer(list);
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            curr.next=node;
            if(node.next!=null)
                pq.offer(node.next);
            curr=curr.next;
        }
        return dummy.next;


    }
}