class Solution {
    public int maxSubArray(int[] nums) {
        
        int end=nums.length-1;
        int maxSum=Integer.MIN_VALUE;
        int currWindSum=0;
       for(end=0;end<nums.length;end++){
        currWindSum+=nums[end];
        if(currWindSum>maxSum)
            maxSum=currWindSum;
        if(currWindSum<=0)
            currWindSum=0;
    
       }
       return maxSum==Integer.MIN_VALUE?0:maxSum;
    }
}