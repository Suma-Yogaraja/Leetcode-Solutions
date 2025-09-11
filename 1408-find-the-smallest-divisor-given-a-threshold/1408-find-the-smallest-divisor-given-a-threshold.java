class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //find min dividor ,such that sum<=threshold boundry(1,max number)
        //find the boundry of divisor
        int left=1;
        int right=0;
        for(int num:nums)
            right=Math.max(right,num);
        while(left<=right){
            int mid=left+(right-left)/2;
            if(check(mid,nums)<=threshold)
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
    private int check(int divisor,int[] nums){

        int sum=0;
        for(int num:nums){
            sum+=(num+divisor-1)/divisor;
            //sum+=(int)Math.ceil((double)num/divisor);
        }
        return sum;
    }
}