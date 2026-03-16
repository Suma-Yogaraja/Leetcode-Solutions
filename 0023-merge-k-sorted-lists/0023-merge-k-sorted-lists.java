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
        if(lists==null)
            return new ListNode();
        ListNode result=new ListNode();
        ListNode ans=result;
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode list:lists){
            if(list!=null)
                pq.add(list);
        }
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            result.next=node;
            result=result.next;
            if(node.next!=null){
                pq.offer(node.next);
                node=node.next;
            } 
        }
            return ans.next;
    }
}