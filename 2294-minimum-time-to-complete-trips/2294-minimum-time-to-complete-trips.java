class Solution {
    int limit;
    public long minimumTime(int[] time, int totalTrips) {
        //time is linearly increasing,so think about binary search
        limit=totalTrips;
        long left=1;  
        long min=Integer.MAX_VALUE;
        for(int i:time)
            min=Math.min(i,min);
        long right= min*(long)totalTrips;
        while(left<right){
            long mid=left+(right-left)/2;
            if(check(mid,time))
                right=mid;
            else
                left=mid+1;
        }
        return left;
    }
    private boolean check(long minTime,int[] time){
        long sum=0;
        for(int t:time){
            sum+=minTime/t;
        }
        return sum>=limit;
    }
}