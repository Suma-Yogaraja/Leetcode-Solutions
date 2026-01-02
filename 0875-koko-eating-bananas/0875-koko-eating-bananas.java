class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;//mim koko eats 1 banana
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(valid_speed(mid,piles,h))
                high=mid-1;
            else
                low=mid+1;
        }
        return low;
    }
    private boolean valid_speed(double limit,int[] piles,int h){
        int hour=0;
        for(int pile:piles){
            hour+=Math.ceil(pile/limit);
        }
        return hour<=h;
    }
}