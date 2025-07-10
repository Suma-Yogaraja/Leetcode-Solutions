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
        Map<Integer,Integer> map=new HashMap<>();
        ListNode temp=head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }  
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        dummy.next=head;
        ListNode curr=head;
        while(curr!=null){
            if(map.get(curr.val)>1){
                prev.next=curr.next;
            }
            else{
                prev=prev.next;
            }   
               curr=curr.next;         
        }
       return dummy.next;
    }
}











        // //first create dummy and 
        // ListNode dummy=new ListNode(0);
        // ListNode prev=dummy;
        // ListNode curr=head;
        // dummy.next=head;
        // if(head==null || (head.val==head.next.val && head.next.next ==null) )
        //     return null;
        // if(head.next==null)
        //     return head;
        // while(curr!=null && curr.next!=null){
        //     if(curr.val==curr.next.val){
        //     while(curr.val ==curr.next.val && curr.next!=null){
        //         curr=curr.next;
        //     }
        //     prev.next=curr.next;
        //     }
        //     else{
        //         prev=prev.next;
        //     }
        //     curr=curr.next;
        // }

        // return dummy.next;     
        
 