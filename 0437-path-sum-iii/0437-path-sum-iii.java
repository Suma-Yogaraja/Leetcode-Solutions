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
    int sum;

    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        if (root == null)
            return 0;
      
       return dfs(root, 0) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);

    }

    private int dfs(TreeNode node, long currSum) {
        int count=0;
        if (node==null)
            return 0;
         currSum += node.val;
         if (currSum == target)
             count++;
         count+=dfs(node.left, currSum);
         count+=dfs(node.right, currSum);

        return count;
    }
}