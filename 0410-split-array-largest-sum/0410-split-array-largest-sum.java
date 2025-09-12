class Solution {
    public int splitArray(int[] nums, int k) {
        //answer is basically min(subarray sum)
        int left=0,right=0;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        int answer=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isValidSplit(nums,k,mid)){
                right=mid-1;
                answer=mid;
            }
            else
                left=mid+1;  
        }
        return answer;
    }
    private boolean isValidSplit(int[] nums,int k,int maxSum){
        int partition=1;
        int currSum=0;
        for(int num:nums){
            if(currSum+num>maxSum){
                partition++;
                currSum=num;
                if(partition>k)
                    return false;
            }
            else
                currSum+=num;
        }
        return true;
    }
}