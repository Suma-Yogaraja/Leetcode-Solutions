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
    List<Integer> res;

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        //if we do inorder traversal,we get sorted increasing array ,for that array we will do binary search
        res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        inOrder(root, res);
        int[] sorted = new int[res.size()];
        for (int i = 0; i < sorted.length; i++)
            sorted[i] = res.get(i);
        //System.out.println(sorted[i]);
        for (int i = 0; i < queries.size(); i++) {
            List<Integer> list = new ArrayList<>();
            int q = queries.get(i);

            // if (sorted[0] == q || sorted[sorted.length - 1] == q)
            //     ans.add(Arrays.asList(q, q));
            if (sorted[0] > q)
                ans.add(Arrays.asList(-1, sorted[0]));
            else if (sorted[sorted.length - 1] < q)
                ans.add(Arrays.asList(sorted[sorted.length - 1], -1));
            else {
                int left = 0;
                boolean found=false;
                int right = sorted.length - 1;
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (sorted[mid] == q) {
                        ans.add(Arrays.asList(q, q));
                        found=true;
                        break;
                    } else if (sorted[mid] > q)
                        right = mid - 1;
                    else
                        left = mid + 1;
                }
                if(!found)
                 ans.add(Arrays.asList(
                        (right >= 0) ? sorted[right] : -1,
                        (left < sorted.length) ? sorted[left] : -1));

            }

        }

        return ans;

    }

    private void inOrder(TreeNode root, List<Integer> res) {

        if (root == null)
            return;
        inOrder(root.left, res);
        res.add(root.val);
        inOrder(root.right, res);
    }

}