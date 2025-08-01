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
    public boolean isValidBST(TreeNode root) {
        if(root==null)
            return true;;
        List<Integer> sort=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        dfs(root,sort);
        for(int i=1;i<sort.size();i++){
            if(sort.get(i)<=sort.get(i-1))
                return false;
        }
        return true;
        
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
