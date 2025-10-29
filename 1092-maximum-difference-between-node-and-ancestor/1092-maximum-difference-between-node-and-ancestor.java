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
    int maxDiff;
    
    public int maxAncestorDiff(TreeNode root) {
        maxDiff=Integer.MIN_VALUE;
        if(root==null)
            return 0;
        //at each node calculate min and max
        dfs(root,root.val,root.val);
        return maxDiff;
    }
    private void dfs(TreeNode node,int min,int max){
        if(node ==null)
            return;
        min=Math.min(min,node.val);
        max=Math.max(node.val,max);
        maxDiff=Math.max(maxDiff,max-min);
        dfs(node.left,min,max);
        dfs(node.right,min,max);
        return;
    }
}