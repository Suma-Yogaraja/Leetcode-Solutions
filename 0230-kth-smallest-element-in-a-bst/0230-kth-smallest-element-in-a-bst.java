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
    public int kthSmallest(TreeNode root, int k) {
        List<TreeNode> sorted=new ArrayList<>();
        //since this is a BST, we can do inorder so we will get sorted list,pick the ith value from it
        bst(root,sorted);
        return sorted.get(k-1).val;
        
    }
    private void bst(TreeNode root,List<TreeNode> sorted){
        if(root==null)
            return;
        bst(root.left,sorted);
        sorted.add(root);
        bst(root.right,sorted);
        return;
    }
}