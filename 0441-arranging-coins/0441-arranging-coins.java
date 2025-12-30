class Solution {
    public int arrangeCoins(int n) {
        //n(n+1)/2 gives number of coins
        long low=0;
        long high=n;
        while(low<=high){
            long mid=low+(high-low)/2;
            // System.out.println(mid);
            long sum=mid*(mid+1)/2;
            if(sum==n)
                return (int)mid;
            else if(sum>n)
             high=mid-1;
            else 
                low=mid+1;
               
        }
        return (int)high;
    }
}