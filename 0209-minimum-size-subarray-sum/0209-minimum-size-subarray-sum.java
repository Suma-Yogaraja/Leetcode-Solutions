class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int totalSum=0;
        for(int num:nums)
            totalSum+=num;
        
        if(totalSum<target)
            return 0;
        int minLength=Integer.MAX_VALUE;
        int start=0;
        int sum=0;
        for(int end=0;end<nums.length;end++){
             sum+=nums[end];
            //  System.out.println("sum is " +sum);
            while(sum>=target){
                // System.out.println("end is " +end);
                minLength=Math.min(end-start+1,minLength);
                sum-=nums[start];
                start++;
            }
     
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
    }
}