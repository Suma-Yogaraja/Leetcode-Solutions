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
    double targetNum;
    int closest;
    public int closestValue(TreeNode root, double target) {
        targetNum=target;
        closest=root.val;
        if(root==null || (root.left==null && root.right==null))
            return root.val;
        double diff=Math.abs(root.val-target);
        System.out.println(diff);
         dfs(root,diff); 
         return closest;   
    }
    private void dfs(TreeNode node,double diff){
        if(node==null)
            return;
        
       if(Math.abs(node.val-targetNum)<diff){
            closest=node.val;
            diff=Math.abs(node.val-targetNum);
       }
       else if(Math.abs(node.val-targetNum)==diff){
         if(closest>node.val)
            closest=node.val;
       }
       dfs(node.left,diff);
        dfs(node.right,diff);
       return;

    }

}