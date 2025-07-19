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
    int maxDiff;
    public int maxAncestorDiff(TreeNode root) {
        maxDiff=0;
        if(root==null)
            return 0;
        dfs(root);
        return maxDiff;
    }
    int[] dfs(TreeNode node){
        if(node==null)
            return new int[]{-1,-1};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        if(node.left==null && node.right==null){
            return new int[] {node.val,node.val};
        }
        int[] left=dfs(node.left);
        int[] right=dfs(node.right);
        for(int i=0;i<2;i++){
            if(left[i]!=-1){
                maxDiff=Math.max(maxDiff,Math.abs(node.val-left[i]));
                min=Math.min(min,left[i]);
                max=Math.max(max,left[i]);
            }
        }
         for(int i=0;i<2;i++){
            if(right[i]!=-1){
                maxDiff=Math.max(maxDiff,Math.abs(node.val-right[i]));
                min=Math.min(min,right[i]);
                max=Math.max(max,right[i]);
            }
        }
        min=Math.min(min,node.val);
        max=Math.max(max,node.val);

        return new int[] {min,max};

    }

}