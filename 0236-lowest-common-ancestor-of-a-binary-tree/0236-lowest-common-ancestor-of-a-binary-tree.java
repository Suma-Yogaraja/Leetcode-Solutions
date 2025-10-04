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
        boolean pFound=false;
        boolean qFound=false;
        return dfs(root,p,q);
    }
    private TreeNode dfs(TreeNode node,TreeNode p,TreeNode q){
        if(node==null)
            return null;
        TreeNode left=dfs(node.left,p,q);
        TreeNode right=dfs(node.right,p,q);
        if(left!=null && right!=null)
            return node;
        if(node==p){
            return node;
        }
        if(node==q){
            return node;
        }
        if(left==null)
            return right;
        else
            return left;
         
    }
}