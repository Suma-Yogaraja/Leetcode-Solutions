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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //edge cases
        if(list1==null && list2==null)
            return null;
        if(list1==null)
            return list2;
        if(list2==null )
            return list1;  
       
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode merged;
        if(l1.val<=l2.val){
            merged=l1;
            l1=l1.next;
        }
        else{
            merged=l2;
            l2=l2.next;
        }
          
        ListNode dummy=merged;
        //System.out.println(dummy.val);
        while(l1!=null && l2!=null){
            //System.out.println(l1.val + ":" + l2.val);
            if(l1.val<=l2.val){
                dummy.next=l1;
                l1=l1.next;
                
                //System.out.println(dummy.val);
            }
            else{
                dummy.next=l2;
                l2=l2.next;
            }
            dummy=dummy.next;
        }
           if(l2!=null){
            dummy.next=l2;
           }
            else if(l1!=null)
                dummy.next=l1;
        
       return merged;
    }
}