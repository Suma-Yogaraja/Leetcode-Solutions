class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //subsets
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans,List<Integer> curr,int start,int[] nums){
        if(start>nums.length)
            return;
        ans.add(new ArrayList<>(curr));
        for(int j=start;j<nums.length;j++){
            curr.add(nums[j]);
            backtrack(ans,curr,j+1,nums);
            curr.remove(curr.size()-1);
        }
    }
}