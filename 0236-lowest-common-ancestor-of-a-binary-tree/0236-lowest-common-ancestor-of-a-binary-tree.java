/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
        TreeNode res=dfs(root,p,q);
        return res;
    }
    private TreeNode dfs(TreeNode node,TreeNode p,TreeNode q){
        if(node==p || node==q)
            return node; 
        if(node==null)
            return null;
       TreeNode left=dfs(node.left,p,q);
       TreeNode right=dfs(node.right,p,q);
        if(left!=null && right!=null)
            return node;
        else if(left!=null)
            return left;
        else if(right!=null)
            return right;
        else return null;
    }
}