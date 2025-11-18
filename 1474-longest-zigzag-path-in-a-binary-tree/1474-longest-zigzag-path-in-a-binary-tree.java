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
    int maxPath;
    public int longestZigZag(TreeNode root) {
        if(root==null)
            return 0;
         maxPath=Integer.MIN_VALUE;
        int lCount=0;
        int rCount=0;
        dfs(root.left,1,rCount,true);
        dfs(root.right,lCount,1,false);
        return maxPath==Integer.MIN_VALUE?0:maxPath;
    }
    private void dfs(TreeNode node,int lc,int rc,boolean direction){
        if(node==null)
            return;
        maxPath=Math.max(maxPath,lc+rc);
        if(direction){
            dfs(node.right,lc,rc+1,false);
            dfs(node.left,1,0,true);
        }
        else{
            dfs(node.left,lc+1,rc,true);
            dfs(node.right,0,1,false);
        }
        return;
    }
}