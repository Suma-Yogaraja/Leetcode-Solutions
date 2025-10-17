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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null)
            return 0;
        //i will do bfs traversal,level by level order to find last level
        int currLevelSum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            currLevelSum=0;
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                currLevelSum+=node.val;
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }
        }
        return currLevelSum;
    }
}































//         if(root==null)
//             return 0;
//         Queue<TreeNode> q=new LinkedList<TreeNode>();
//         int sum=0;
//         q.add(root);
//         while(!q.isEmpty()){
//             int size=q.size();
//             sum=0;
//             for(int i=0;i<size;i++){
//                 TreeNode node=q.remove();
//                 sum=sum+node.val;
//                 if(node.left!=null)
//                     q.add(node.left);
//                 if(node.right!=null)
//                     q.add(node.right);
//             }

//         }
//         return sum;
//     }
// }