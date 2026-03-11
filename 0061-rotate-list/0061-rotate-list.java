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
    public ListNode rotateRight(ListNode head, int k) {
        //use slow and fast to find the head of new rotated list
        if(head==null || head.next==null)
            return head;
        int n=1;
        ListNode slow=head;
        ListNode fast=head;
       while(fast.next!=null){
            fast=fast.next;
            n++;
          
       }
    //    System.out.println(n);
       k=k%n;
       if(k==0)
        return head;
       for(int i=1;i<(n-k);i++){
        slow=slow.next;
       }
       ListNode newHead=slow.next;
       fast.next=head;
       slow.next=null;

    //    System.out.println(slow.val);
        return newHead;
    }
}