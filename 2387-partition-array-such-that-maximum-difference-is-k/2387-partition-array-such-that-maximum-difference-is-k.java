class Solution {
    public int partitionArray(int[] nums, int k) {
        //greedy approach
        //to get min diff,max and min in that subsequence should not be apart so thinking of sorting or heap
        if(nums.length<=1)
            return 1;
        Arrays.sort(nums);
        int subSeq=1;
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]-min>k){
                min=nums[i];
                subSeq++;
            }
        }
        return subSeq;
    }
}