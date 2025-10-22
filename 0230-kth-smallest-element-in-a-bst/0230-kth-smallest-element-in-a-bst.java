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
    int count;
    int result;
    public int kthSmallest(TreeNode root, int k) {
        count=0;
        result=-1;
        //since this is a BST, we can do inorder so we will get sorted list,pick the ith value from it
        bst(root,k);
        return result;
        
    }
    private void bst(TreeNode root,int k){
        if(root==null)
            return;
        bst(root.left,k);
        count++;
        if(count==k){
            result=root.val;
            return;
        }
        bst(root.right,k);
    }
}