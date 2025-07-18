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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        //edge case
        if(root==null)
            return 0;

        dfs(root,false);
        return sum;
    }
//to track left node, isLeft is used and is set to true only during left recursive call
    void dfs(TreeNode node,boolean isLeft){
         if(node==null)
            return;
        dfs(node.left,true); 
        dfs(node.right,false);
        if(node.left==null && node.right==null && isLeft){
            sum=sum+ node.val; 
        }
       
    }
}