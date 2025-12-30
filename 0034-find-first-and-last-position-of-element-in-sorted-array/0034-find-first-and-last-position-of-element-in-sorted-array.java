class Solution {
    public int[] searchRange(int[] nums, int target) {
       //finding elemnt is easy but finding first and last os bit confusin
       int firstIndex=binarySearch(nums,target,true);
       int lastIndex= binarySearch(nums,target,false);
       return new int[]{firstIndex,lastIndex};
    }
    private int binarySearch(int[] nums,int target,boolean isFirst){
        int l=0;
        int pos=-1;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                //found elemnt 
                if(isFirst)
                    r=mid-1;
                else
                    l=mid+1;
                 pos=mid;     
            }
            else if(nums[mid]>target)
                r=mid-1;
            else
                l=mid+1;
        }
        return pos;
    }
}