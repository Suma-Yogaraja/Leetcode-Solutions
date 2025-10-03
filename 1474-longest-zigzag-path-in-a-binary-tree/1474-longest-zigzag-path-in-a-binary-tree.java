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
        maxPath=Integer.MIN_VALUE;
        if(root==null)
            return 0;
        int lc=0;
        int rc=0;
        //left =true
        dfs(root.left,1,rc,true);
        dfs(root.right,lc,1,false);
        return maxPath==Integer.MIN_VALUE?0:maxPath;

    }
    private void dfs(TreeNode node,int lc,int rc,boolean direction){
        if(node==null)
            return;
        maxPath=Math.max(maxPath,lc+rc);
        if(direction){
            //left is true right is false,now go right
            dfs(node.right,lc,rc+1,false);
            dfs(node.left,1,0,true);
        }
        else{
             dfs(node.left,lc+1,rc,true);
            dfs(node.right,0,1,false);
        }
    }

}