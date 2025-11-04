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
    public ListNode reverseKGroup(ListNode head, int k) {
        //find the length of the listNode
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;//his is tail 
        ListNode currNode = dummy.next;
        ListNode prevGroupTail = dummy;
        while (currNode != null) {
            ListNode nextStart = new ListNode(0);
            ListNode endNode = kNode(k, currNode);
            if (endNode != null) {
                nextStart = endNode.next;
                ListNode newHead = reverse(currNode, endNode);
                prevGroupTail.next = newHead;
                currNode.next = nextStart;
                prevGroupTail = currNode;
                currNode = nextStart;

            } else 
                break;
            
        }

        return dummy.next;
    }

    private ListNode kNode(int k, ListNode curr) {
        ListNode temp = curr;
        for (int i = 1; i < k; i++) {
            if (temp == null || temp.next == null)
                return null;
            temp = temp.next;
        }
        return temp;
    }

    private ListNode reverse(ListNode start, ListNode end) {
        ListNode prevNode = null;
        ListNode curr = start;
        ListNode nextNode = null;
        ListNode stop = end.next;
        while (curr != stop) {
            nextNode = curr.next;
            curr.next = prevNode;
            prevNode = curr;
            curr = nextNode;
        }
        return prevNode;
    }
}