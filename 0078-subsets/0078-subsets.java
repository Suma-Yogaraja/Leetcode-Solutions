class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,0,new ArrayList<>(),nums);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans,int i,List<Integer> curr,int[] nums){
        if(i>nums.length)
            return;
        ans.add(new ArrayList<>(curr));
        for(int j=i;j<nums.length;j++){
            curr.add(nums[j]);
            backtrack(ans,j+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}