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
    int target;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        //till i traverese leaf,i will be adding the ans
        target=targetSum;
        if(root==null)
            return false;
        return dfs(root,0);  
    }
    private boolean dfs(TreeNode node,int ans){
        if(node==null)
            return false;
        if(node.left==null && node.right==null)
            return (ans+node.val)==target;
        // System.out.println(ans);
        ans+=node.val;
        boolean left=dfs(node.left,ans);
        boolean right=dfs(node.right,ans);
        return left || right;
    }
}