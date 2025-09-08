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
        if(lists==null || lists.length==0)
            return null;
            System.out.println(lists.length);
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode list:lists){
            if(list!=null)
                pq.add(list);
        }
        ListNode result=new ListNode(0);
        ListNode curr=result;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            curr.next=node;
            if(node.next!=null)
                pq.add(node.next);
            curr=curr.next;
            
        }
        return result.next;
    }
}