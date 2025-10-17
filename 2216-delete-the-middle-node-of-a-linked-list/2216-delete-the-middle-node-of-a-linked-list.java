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
    public ListNode deleteMiddle(ListNode head) {
        //i will use fast and slow pointer to get middle of linked list and prevnode to get prev node of slow
        if(head==null || head.next==null)
         return null;
        // ListNode node=new ListNode();
        // node.next=head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode prevNode=null;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prevNode=slow;
            slow=slow.next;
        }

       prevNode.next=slow.next;
        return head;
    }
}





























//         //find the length n of the given linked list
//         ListNode dummy=head;
//         int n=0;
//         if(head==null || head.next==null){
//             return null;
//         }
//         while(dummy!=null){
//             n++;
//             dummy=dummy.next;
//         }
//        // System.out.println(n);
       
//         dummy=head;
//         //iterate till n/2 and delink the middle elemnt
//         for(int i=1;i<n/2;i++){
//             dummy=dummy.next;
//         }
//         //System.out.println(dummy.val);
//         dummy.next=dummy.next.next;
//         return head;
//     }
// }