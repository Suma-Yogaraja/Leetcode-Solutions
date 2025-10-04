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
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res=new ArrayList<>();
        if(root==null)
            return res;
        dfs(root,targetSum,0,new ArrayList<>());
        return res;
    }
    private void dfs(TreeNode node,int targetSum,int currSum,List<Integer> innerList){
        if(node==null)
            return;
        innerList.add(node.val);
        
        if(node.left==null && node.right==null){//leaf node
            if(currSum+node.val==targetSum)
                 res.add(new ArrayList<>(innerList));
        }
        dfs(node.left,targetSum,currSum+node.val,innerList);
        dfs(node.right,targetSum,currSum+node.val,innerList);
        innerList.remove(innerList.size()-1);
    }
}
