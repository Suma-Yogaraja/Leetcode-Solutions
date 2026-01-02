class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,ans,new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] nums,List<List<Integer>> ans,List<Integer> currList){
        if(currList.size()==nums.length){
            ans.add(new ArrayList<>(currList));
            return;       
         }
         for(int num:nums){
            if(!currList.contains(num)){
                currList.add(num);
                backtrack(nums,ans,currList);
                currList.remove(currList.size()-1);
            }
         }
         return;
    }
}