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
    int ans;
    public int pathSum(TreeNode root, int targetSum) {
         ans=0;
         traverse(root,targetSum);
         return ans;
    }
    private void traverse(TreeNode root, int targetSum){
         if(root==null)
            return;
        dfs(root,targetSum,0L);
        traverse(root.left,targetSum);
        traverse(root.right,targetSum);
        
    }
    private void dfs(TreeNode root,int target,long curr){
        if(root==null)
            return;
        curr+=root.val;
        if(curr==target)
            ans++;
        dfs(root.left,target,curr);
        dfs(root.right,target,curr);
 
    }
}