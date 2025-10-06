class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        //kadanes approach
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int num:nums){
            currSum+=num;
            if(currSum>maxSum)
                maxSum=currSum;
            if(currSum<0)
                currSum=0;//start from fresh
        }
        return maxSum;

    }
}