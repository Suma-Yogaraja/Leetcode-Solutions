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
        //here as tree is BST ,we take advantage of the property that if it is travered in inorder,we get ascending order
        //create an array of int in ascending order
        //return kth elemnt in that array
        List<Integer> res=new ArrayList<>();
        inOrder(root,res);
        // int[] ans=new int[res.size()];
        // for(int i=0;i<res.size();i++){
        //     ans[i]=res.get(i);
        // }
        return res.get(k-1);
    }
    void inOrder(TreeNode node,List<Integer> res){
        if(node==null)
            return;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
    }
}