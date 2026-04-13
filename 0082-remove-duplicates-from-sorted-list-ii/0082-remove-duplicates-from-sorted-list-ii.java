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
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set=new HashSet<>();
        ListNode dummy=new ListNode(0);
        // dummy.next=head;
        ListNode curr=dummy;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                //duplicate exists
                // System.out.println("dup exists and its value :"+head.val);
                int dup=head.val;
                while(head!=null && head.val==dup) {
                    head=head.next;
                }   
                continue;  
            }
            else{
                // System.out.println("non dup value :"+head.val);
                curr.next=head;
                curr=curr.next;
                head=head.next;
            }
       
        }
        curr.next=null;
        return dummy.next;
    }
}