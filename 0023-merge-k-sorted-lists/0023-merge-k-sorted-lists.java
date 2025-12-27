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
        PriorityQueue<ListNode> minHeap=new PriorityQueue<>((a,b)-> a.val-b.val);
        if(lists.length==0)
            return null;
        for(ListNode list:lists){
            if(list!=null)
                minHeap.add(list);
        }
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(!minHeap.isEmpty()){
            ListNode node=minHeap.remove();
            ans.next=node;
            ans=ans.next;
            if(node.next!=null)
                minHeap.add(node.next);
        }
        return dummy.next;
    }
}