class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist=Integer.MIN_VALUE;

       for(int i=0;i<nums1.length;i++){
           int lastIndex=binarySearch(nums2,i,nums2.length-1,nums1[i]);
            maxDist=Math.max(maxDist,lastIndex-i-1);
       }
       return (maxDist==-1)?0:maxDist;
    }
    private int binarySearch(int[] nums,int left,int right,int target){
        while(left<=right){
            int mid=left+(right-left)/2;
            // if(nums[mid]>=target )
            //     return mid+1;
          if(nums[mid]>=target)
                left=mid+1;
            else
                right=mid-1;
        }
            return left;
    }
}