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
    public List<List<Integer>> levelOrder(TreeNode root) {
        //Use BFS to go to a level
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<TreeNode>();
        if(root==null)
            return ans;
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> innerList=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                innerList.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(innerList);
        }
            return ans;
    }
}