class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDist=0;

       for(int i=0;i<nums1.length;i++){
           int lastIndex=binarySearch(nums2,i,nums2.length-1,nums1[i]);
           int j=lastIndex-1;
           if(j>=i)
             maxDist=Math.max(maxDist,j-i);
       }
       return maxDist;
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