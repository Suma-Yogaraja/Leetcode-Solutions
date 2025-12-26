/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null || headB==null)
            return null;
        Stack<ListNode> stack1=new Stack<>();
        Stack<ListNode> stack2=new Stack<>();
        ListNode intersect=null;
        while(headA!=null){
            stack1.push(headA);
            headA=headA.next;
        }
        while(headB!=null){
            stack2.push(headB);
            headB=headB.next;
        }
        while(!stack1.isEmpty() && !stack2.isEmpty()){
            if(stack1.peek()==stack2.peek()){
                intersect=stack1.pop();
                stack2.pop();
                
            }
            else
            break;
        }
        return intersect;
    }
}