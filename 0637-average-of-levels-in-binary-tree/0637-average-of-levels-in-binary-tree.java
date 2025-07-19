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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Double> ans=new ArrayList<Double>();
        if(root==null)
            return ans;
        double sum=0;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                sum+=node.val;
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(sum/size);
        }
        return ans;
    }
}