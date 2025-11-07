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
        //root to leaf traverse
        int sum=0;
        List<Integer> res=new ArrayList<>();
        return dfs(root,0); 
    }
    private int dfs(TreeNode node,int currNumber){
        if(node==null)
            return 0;
        currNumber=currNumber*10+node.val;
        // System.out.println(currNumber);
        if(node.left==null && node.right==null){
                return currNumber;
        }
        else
            return dfs(node.left,currNumber)+ dfs(node.right,currNumber);
    } 
}