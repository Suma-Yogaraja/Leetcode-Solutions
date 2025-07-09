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
    public int pairSum(ListNode head) {
        int max = 0;
        ListNode firstHalf = head;
        //first find middle of node using fast slow pointer
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse the second half of node
        ListNode secondHalf = reverse(slow);
        //Now find the sum 
        while (secondHalf != null) {
            int sum = firstHalf.val + secondHalf.val;
            max = Math.max(max, sum);
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return max;
    }

    ListNode reverse(ListNode curr) {
        ListNode prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

}