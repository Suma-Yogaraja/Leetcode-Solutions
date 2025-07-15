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
        // we use DFS to find the leaf node,
        target=targetSum;
        return dfs(root,0);
        
    }
    boolean dfs(TreeNode node,int curr){
        //if root node has no child
        if(node==null)
         return false;

         //if we found leaf node and target is equal to given targetSum
        if(node.left==null && node.right==null){
            return (curr+node.val==target);
        }
         //logic for moving onto next nodes using DFS postorder
        curr+=node.val;
        boolean left=dfs(node.left,curr);
        boolean right=dfs(node.right,curr);
        return left||right;

    }

}