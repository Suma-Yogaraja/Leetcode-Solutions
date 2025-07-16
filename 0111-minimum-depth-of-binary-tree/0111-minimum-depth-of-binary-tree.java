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
    public int minDepth(TreeNode root) {
        int depth=0;
        int mini=0;
        //use dfs
        if(root==null)
            return 0;
        
        //recursive call
            int left=minDepth(root.left);
            int right=minDepth(root.right);
            if(left==0)
                return right+1;
            else if(right==0)
                return left+1;
                
            
           return Math.min(left,right)+1;

        
    }
}