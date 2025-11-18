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
    int targetValue;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        targetValue=target;
        if(root==null)
            return null;
        return  dfs(root);
        
    }
    private TreeNode dfs(TreeNode node){
        if(node==null)
            return null;
        node.left=dfs(node.left);
        node.right=dfs(node.right);
        if(node.left==null && node.right==null){//leaf node
            if(node.val==targetValue){
                //candidate to remove
               return null;
            }
        }
        return node;
    }
}