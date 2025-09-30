class Solution {
    public int findMin(int[] nums) {
        //just like finding pivot elemnts
        int n=nums.length;
        int left=0;
        int right=n-1;
        if(n==0)
            return -1;
        while(left<right){
            int mid=left+(right-left)/2;
            //left is sorted
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else
                right=mid;
        }
    System.out.println("pivot ele is "+left);
        return nums[left];
    }
}