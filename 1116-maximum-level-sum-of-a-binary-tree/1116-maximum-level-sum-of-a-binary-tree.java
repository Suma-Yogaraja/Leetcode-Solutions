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
    int maxSum;
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        maxSum=Integer.MIN_VALUE;
        int maxLevel=0;
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            level++;
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                sum+=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
                
            }
            if(maxSum<sum){
                maxSum=sum;
                maxLevel=level;
            }
            
        }
        return maxLevel;
    }
}