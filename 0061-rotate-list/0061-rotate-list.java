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
        if(head==null)
            return null;
        int n=0;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            fast=fast.next;
            n++;
        }
        System.out.println("len is :" +n);
        k=k%n;
        if(k==0)
            return head;
        fast=head;
        while(k>0 && fast!=null){
            fast=fast.next;
            // System.out.println("fast is :" +fast.val);
            k--;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // System.out.println("slow is :" +slow.val);
        // System.out.println("fast is :" +fast.val);
        ListNode nextHead=slow.next;
        slow.next=null;
        fast.next=head;
        return nextHead;
    }
}