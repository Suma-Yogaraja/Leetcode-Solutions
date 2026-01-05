class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //subsets
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    private void backtrack(List<List<Integer>> ans,List<Integer> curr,int start,int[] nums){
        if(start==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
           curr.add(nums[start]);
            backtrack(ans,curr,start+1,nums);
            curr.remove(curr.size()-1);
             backtrack(ans,curr,start+1,nums);
        
    }
}