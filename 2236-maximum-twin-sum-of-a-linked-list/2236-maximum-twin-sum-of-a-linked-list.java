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
    public int pairSum(ListNode head) {
        if(head==null || head.next==null)
            return 0;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
            
        }
        int maxSum=0;
        System.out.println(prev.val);
        prev.next=null;
        ListNode secondhalf=reverse(slow);
        while(head!=null){
            maxSum=Math.max(maxSum,head.val+secondhalf.val);
            head=head.next;
            secondhalf=secondhalf.next;

        }
        return maxSum;
    }
    private ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    while (curr != null) {
        ListNode nextNode = curr.next; 
        curr.next = prev;              
        prev = curr;                   
        curr = nextNode;               
    }
    return prev;
}
}