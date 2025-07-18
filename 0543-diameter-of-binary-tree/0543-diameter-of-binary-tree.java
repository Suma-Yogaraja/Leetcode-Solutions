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
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
      diameter=0;
        if(root==null)
            return 0;
        depth(root);
       
        return diameter;
        
    }
    int depth(TreeNode node){
    
        if(node==null)
            return 0;
        if(node.left==null && node.right==null)
            return 1;   
        int l=depth(node.left);
        int r=depth(node.right);
        
         diameter=Math.max(diameter,l+r);
         return Math.max(l,r)+1;
       // return Math.max(l,r)+1;
    }

}