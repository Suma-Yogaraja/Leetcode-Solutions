class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        /* First, the problem is asking for the minimum eating speed. If Koko can eat all the bananas with a speed of k, she can surely eat all the bananas with a speed of k + 1 as well. If she cannot, she surely cannot with a speed of k - 1 either.
        
        This creates the two "zones". Next, we need to identify the search space bounds. No matter what the input is, we know the eating speed can never be lower than 1 because the eating speed must be an integer, and an eating speed of 0 would mean no bananas ever get eaten. If the eating speed is max(piles), then each pile will take one hour. It is impossible to improve on this (since the problem states that even if the eating speed is greater than the number of bananas in a pile, it will still take one hour). Therefore, our search space is [1, max(piles)].
        
        Finally, we need to figure out how to implement the check function for a given eating speed k.*/
        int left=1;
        int right=0;
        int limit=h;
        for(int banana : piles)
            right=Math.max(right,banana);
        
        while(left<=right){
            int mid=left+(right-left)/2;
            boolean check=isPossible(mid,limit,piles);
            if(check)
                right=mid-1;
            else
                left=mid+1;
        }
        return left;
    }
    private boolean isPossible(double num,int limit,int[] piles){
        int h=0;
        for(int pile:piles){
            h+=Math.ceil(pile/num);
        }
        return h<=limit;
    }
}