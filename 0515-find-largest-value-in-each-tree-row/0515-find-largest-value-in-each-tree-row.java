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
    public List<Integer> largestValues(TreeNode root) {
        // do bfs each level
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        if(root==null)
            return new ArrayList<>();
       q.add(root);
        //ans.add(root.val);
        while (!q.isEmpty()) {
            int size = q.size();
            maxi=Integer.MIN_VALUE;;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                maxi=Math.max(node.val,maxi);
                if (node.left != null) 
                    q.offer(node.left);
                if (node.right != null) 
                    q.offer(node.right);
                
            }
            ans.add(maxi);

        }
        return ans;
    }
}