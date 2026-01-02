class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length)
            return -1;
        int low=1;
        int high=0;
        int ans=0;
        for(int bloom:bloomDay){
            high=Math.max(bloom,high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(mid,bloomDay,m,k)){
                high=mid-1;
                ans=mid;
            }
            else
                low=mid+1;
        }
        return ans;
    }
    private boolean isValid(int limit,int[] bloomday,int m,int k){
        int contEle=0;
        int boq=0;
        for(int i=0;i<bloomday.length;i++){
            if(bloomday[i]<=limit){
                contEle++;
                if(contEle>=k){
                    boq++;
                    contEle=0;
                }
                if(boq==m)
                    return true;  
            }
            else
                contEle=0;
        }
        return false;
    }
}