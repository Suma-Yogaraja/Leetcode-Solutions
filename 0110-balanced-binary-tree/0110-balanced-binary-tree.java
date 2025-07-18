/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    boolean balance;
    public boolean isBalanced(TreeNode root) {
        balance = true;
        if (root == null)
            return true;
        depth(root);
        return balance;  
    }

    int depth(TreeNode node) {
        //when tree is not balanced,return -1 for further caluculations
        if (balance == false)
            return -1;
        int maxDepth = 0;
        //check the edge case
        if (node == null)
            return 0;
        //recrusive call to left and right
        int l = depth(node.left);
        int r = depth(node.right);
        maxDepth = Math.max(l, r) + 1;
        //check whether node is balanced
        if (Math.abs(l - r) > 1)
            balance = false;
        return maxDepth;
    }
}