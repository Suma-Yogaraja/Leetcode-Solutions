/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null)
            return false;
        //here im using concept of fast and slow pointer
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
}















//         Set<ListNode> seen=new HashSet<>();
//         while(head!=null){
//             if(seen.contains(head))
//                 return true;
//             seen.add(head);
//             head=head.next;
//         }

//         return false;
        
//     }
// }