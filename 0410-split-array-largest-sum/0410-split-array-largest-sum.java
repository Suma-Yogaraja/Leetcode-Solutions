class Solution {
    public int splitArray(int[] nums, int k) {
          //split in k ways to get min(largest sum)
        //worst case is sum =sum of all elemnts
        //best case largest sum=max of 
        int left=0;
        int right=0;
        int ans=right;
        for(int num:nums){
            left=Math.max(left,num);
            right+=num;
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(valid_array(mid,nums,k)){
                right=mid-1;
                ans=mid;
            }
            else
                left=mid+1;
        }
        return ans;
    }
    private boolean valid_array(int mid,int[] nums,int k){
        int split=1;
        int sum=0;
        for(int num:nums){
            if(sum+num>mid){
                sum=num;
                split++;
                if(split>k)
                    return false;
            }
            else
                sum+=num;
        }
        return true;
    }
}