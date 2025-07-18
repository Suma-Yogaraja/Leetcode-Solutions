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
    public boolean isSymmetric(TreeNode root) {
        //take root node and call tree equal fn to check for symmety
        if(root==null)
            return true;
        TreeNode left=root.left;
        TreeNode right=root.right;
         return isEqual(left,right);

    }
    boolean isEqual(TreeNode p,TreeNode q){
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        if(p.val!=q.val)   
            return false;
        boolean left=isEqual(p.left,q.right);
        boolean right=isEqual(p.right,q.left);

        return left&&right;

    }

}