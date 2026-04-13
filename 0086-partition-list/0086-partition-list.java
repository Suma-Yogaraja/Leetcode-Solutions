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
       //create twol list ,one list has nodes<x ,other has node>=x
       ListNode list1=new ListNode(0);
       ListNode head1=list1;
       ListNode list2=new ListNode(0);
       ListNode head2=list2;
       while(head!=null){
        if(head.val<x){
            list1.next=head;
            list1=list1.next;
        }
        else{
            list2.next=head;
            list2=list2.next;
        }
        head=head.next;
       }
    //    System.out.println(head1.val);
       list2.next=null;
       list1.next=head2.next;
       return head1.next;
    }
}