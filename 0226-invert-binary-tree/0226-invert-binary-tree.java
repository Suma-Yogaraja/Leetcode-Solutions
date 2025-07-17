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
        /* first check if a node is leaf node,
         if yes ,take right leaf node,then change the value
         */

        if(root==null)
            return null;
        
        //exchange the nodes
        TreeNode left=root.left;
        root.left=root.right;
        root.right=left;

        //call the left and right
        invertTree(root.left);
        invertTree(root.right);

       return root; 
        
    }


}