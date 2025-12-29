class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length<=0)
            return 0;
        int maxNum=0;
        int start=0;
        int end=0;
        int i=0;
        while(end<nums.length){
            if(nums[end]!=1){
                   i++;
            }
            while(i>k){
                //shrink start
                if(nums[start]!=1){
                    i--;
                }
                start++;
            }
             maxNum=Math.max(maxNum,end-start+1);
            end++;
        }
       
        return maxNum;
    }
}