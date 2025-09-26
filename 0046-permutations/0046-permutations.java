class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        List<Integer> current=new ArrayList<>();
        backtrack(nums,ans,visited,current);
        return ans;
    }
    private void backtrack(int[] nums,List<List<Integer>> ans,boolean[] visited,List<Integer> curr){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!visited[i]){
              visited[i]=true;
              curr.add(nums[i]);
              backtrack(nums,ans,visited,curr);
              curr.remove(curr.size()-1);
              visited[i]=false;
            }
            else
                continue;
        }
    }
}