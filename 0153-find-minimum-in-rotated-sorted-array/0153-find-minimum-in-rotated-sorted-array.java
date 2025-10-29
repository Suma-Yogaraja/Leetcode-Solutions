class Solution {
    public int findMin(int[] nums) {
        //like finding pivot elemnt
        //do a binary search
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[end]) {
                //left is sorted check right
                start = mid+1;
            }
            else
                end=mid;
        }
        return nums[start];
    }
}