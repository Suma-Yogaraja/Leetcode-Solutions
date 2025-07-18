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
    double targetSum;
    int closest;
    double minDiff;

    public int closestValue(TreeNode root, double target) {
        if (root == null)
            return 0;
        targetSum = target;
        closest = root.val;
        minDiff = Math.abs(target - root.val);
        //System.out.println(minDiff);
        dfs(root);
        return closest;

    }

    void dfs(TreeNode node){
        if(node==null)
         return;
        //take node  value and check aganist minDiff value 
      double currDiff=Math.abs(targetSum-node.val);
      //System.out.println(currDiff);
      if(currDiff<minDiff){
       minDiff=currDiff;
       closest=node.val;   
       //System.out.println(closest);
      }
      if(currDiff==minDiff)
        {
            if(closest>node.val)
              closest=node.val;
        }
        //do recursive
        dfs(node.left);
        dfs(node.right);
        
    }
}