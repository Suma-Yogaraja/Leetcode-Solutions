class Solution {
    public int shipWithinDays(int[] weights, int days) {
        //find min capacity per day 

        int left=0 ;
        int right =0;
        for(int weight:weights){
            left=Math.max(left,weight);//worst case where capacity is min
            right+=weight;// best case ship all in one day
        }
        int ans=right;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(canShip(weights,days,mid)){
                right=mid-1;
                ans=mid;
            }
            else
                left=mid+1;
           // System.out.println("left :right" + left + " : " +right);
        }
        return ans;
    }
    private boolean canShip(int[] weights,int totalDay,int maxCap){
        int day=1;
        int curWeight=0;
        for(int w:weights){
            if(curWeight+w>maxCap){
                day++;
                curWeight=w;
                if(day>totalDay)
                    return false;
            }
            else
                curWeight+=w;
           // System.out.println("curr weight" + curWeight);     
        }
        return true;
    }
}