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
    int target;

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        target=targetSum;
        
        List<List<Integer>> ans=new ArrayList<>();
         dfs(root,ans,0,new ArrayList<>());
        return ans;
        
    }

    private void dfs(TreeNode root,List<List<Integer>> ans,int curr, List<Integer> innerList){
            if(root==null)
                return ;
            innerList.add(root.val);
            curr+=root.val;

            if(root.left==null && root.right==null){//leaf node detetcted
                if(curr==target){
                    // innerList.add(root.val);
                    ans.add(new ArrayList<>(innerList));
                }
            }
            
             dfs(root.left,ans,curr,innerList);
             dfs(root.right,ans,curr,innerList);
            innerList.remove(innerList.size()-1);
  
        }
}