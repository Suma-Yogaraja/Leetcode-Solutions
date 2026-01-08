class Solution {
    public int maxDistToClosest(int[] seats) {
        //corner case when l=-1 or r>n
        int l=-1;
        int maxClose=0;
        int r=0;
        int close=0;
        if(seats.length<1)
            return 0;
            int n=seats.length;
        for(r=0;r<n;r++){
            if(seats[r]!=0){
                if(l==-1)
                    close=r-l-1;
                else {
                    close=(r-l)/2;
                }
                
               maxClose=Math.max(maxClose,close);
              l=r;
            }
        }
        maxClose=Math.max(maxClose,(n-l-1));
        return maxClose;
    }
}