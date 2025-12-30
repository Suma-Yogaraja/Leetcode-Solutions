class Solution {
    public int search(int[] nums, int target) {
        if(nums.length<=0)
            return -1;
        //use binary search to find pivot elemnt
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;//mid index
            if(nums[mid]==target)
                return mid;
            //left  sorted
            else if(nums[l]<=nums[mid]){
                if(nums[l]<=target && target<nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            //right  rotated
            else{
                if(nums[mid]<target && target<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            } 
        }
        return -1;
    }
}