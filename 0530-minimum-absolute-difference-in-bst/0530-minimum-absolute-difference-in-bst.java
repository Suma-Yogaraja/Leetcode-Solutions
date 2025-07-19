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
    public int getMinimumDifference(TreeNode root) {
        //as this is Binary search tree,we do inorder traversal for sorted array
        //then find diff between each elemnt in sorted array
        if(root==null)
            return 0;
        List<Integer> sort=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        dfs(root,sort);
        for(int i=1;i<sort.size();i++){
            min=Math.min(min,sort.get(i)-sort.get(i-1));
        }
        return min;
    }
    void dfs(TreeNode node,List<Integer> sort){
        if(node==null)
            return;
        //do in order traversal
        dfs(node.left,sort);
        sort.add(node.val);
        dfs(node.right,sort);
    }
}