class Solution {
    public int maximumCandies(int[] candies, long k) {
        int total=0;
        int right=0;
        int result=0;
        for(int candy:candies){
            //total+=candy;
            right=Math.max(right,candy);

        }
        // if(total<k)
        //     return 0;
        int left=1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canDivide(mid,candies,k)){
                left=mid+1;
                result=mid;
            }
            else
                right=mid-1;
        }
        return result;
    }
        private boolean canDivide(int maxCandy,int[] candies,long k){
            long count=0;
            for(int pile:candies){
                     count+=pile/maxCandy;
            }
            return (count>=k);
            
        }
    
}