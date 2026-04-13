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
    public int sumNumbers(TreeNode root) {
        int res=0;
       if(root==null)
        return 0;
        res=dfs(root,0);
        return res;
    } 

    public int dfs(TreeNode node,int result){
       if(node==null)
        return 0;
        if(node.left==null && node.right==null){
            //leafnode
            result=result*10+node.val;
            // System.out.println(result);
            return result;
                
        }
        result=result*10+node.val;
        return dfs(node.left,result)+dfs(node.right,result);
        
    }
}