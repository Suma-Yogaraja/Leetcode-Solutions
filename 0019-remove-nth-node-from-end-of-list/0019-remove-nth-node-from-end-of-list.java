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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return head;
        if(head.next==null && n==1)
            return null;
        //im making use of tow pointer + sliding window,create a window of size n then move
        ListNode slow=head;
        ListNode fast=head;
        for(int i=0;i<n;i++)
            fast=fast.next;
         if(fast==null)
            return slow.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        // System.out.println(slow.val);
        // System.out.println(fast.val); 
        

        slow.next=slow.next.next;
        return head;
    }
}

























//         //declare fast and slow pointer and move fast pointer such that it is at a gap of n
//        ListNode dummy=new ListNode(-1);
//        dummy.next=head;
//        if(head==null || head.next==null)
//         return null;
//         ListNode slow=dummy;
//         ListNode fast=dummy;
//         for(int i=0;i<=n;i++){
//             fast=fast.next;
//         }
//         while(fast!=null){
//             fast=fast.next;
//             slow=slow.next;
//         }
//         slow.next=slow.next.next;
//         return dummy.next;
        

     
//     }
// }