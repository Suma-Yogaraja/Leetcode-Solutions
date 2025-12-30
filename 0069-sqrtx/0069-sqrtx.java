class Solution {
    public int mySqrt(int x) {
        if(x<=1)
            return x;
        //using binary serach
        int[] nums=new int[x];
        
        for(int i=1;i<x;i++){
            nums[i]=i;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // System.out.println(mid);
            if(nums[mid] * nums[mid]==x)
                return nums[mid];
            else if (nums[mid] * nums[mid]>x){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return nums[end];
    }
}