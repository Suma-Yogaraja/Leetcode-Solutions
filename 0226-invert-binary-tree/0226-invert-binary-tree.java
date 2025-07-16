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
    public TreeNode invertTree(TreeNode root) {
        //use dfs function to go till left depth and right depth
        /*
        go to leftmost and keep in left node,go to right most and keep in right node
        now exchange left and right*/
        if(root==null)
            return null;
          TreeNode left= invertTree(root.left);
          TreeNode right=invertTree(root.right);
          root.left=right;
          root.right=left;
        return root;
          
    }


}