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
    public ListNode partition(ListNode head, int x) {    
        ListNode p1=new ListNode();
        ListNode p2=new ListNode();
        ListNode p=p1;
        ListNode q=p2;
        while(head!=null ){
            if(head.val<x){
                p1.next=head; 
                p1=p1.next;
                // System.out.println(head.val);
            }
            else{
                 p2.next=head;
                 p2=p2.next;
            }
            ListNode temp=head.next;
             head.next=null;
             head=temp;
        }
        //  System.out.println(p.next.val);
         p1.next=q.next;
        return p.next;
    }
}