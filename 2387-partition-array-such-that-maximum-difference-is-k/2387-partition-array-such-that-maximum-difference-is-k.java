class Solution {
    public int partitionArray(int[] nums, int k) {
        //greedy approach
        Arrays.sort(nums);
        int x=nums[0];
        int ans=1;
        for(int i:nums){
            if(i-x>k){
                x=i;
                ans++;
            }
        }
        return ans;
    }
}