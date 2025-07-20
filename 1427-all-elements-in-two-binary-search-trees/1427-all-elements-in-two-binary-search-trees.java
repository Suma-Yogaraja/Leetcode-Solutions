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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> node1=new ArrayList<>();
        List<Integer> node2=new ArrayList<>();
        
        //travese both trees in inorder
        if(root1==null && root2==null)
            return ans;
        dfs(root1,node1);
        dfs(root2,node2);
        //compare node1 and node 2 and create a ascending order ans list
        ans.addAll(node1);
        ans.addAll(node2);
        Collections.sort(ans);
        return ans;

    }

   void dfs(TreeNode node,List<Integer> values){
        if(node==null)
            return ;
        dfs(node.left,values);
        values.add(node.val);
        dfs(node.right,values);
        
    }
}