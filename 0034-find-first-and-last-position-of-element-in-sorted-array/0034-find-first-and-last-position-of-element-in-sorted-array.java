class Solution {
    public int[] searchRange(int[] nums, int target) {
        //int[] result=new int[2];
        int firstIndex=binarySearch(nums,target,true);
        int lastindex=binarySearch(nums,target,false);
        return new int[] {firstIndex,lastindex};
        
        
    }

    int binarySearch(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int pos=-1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                pos= mid;
                if(isFirst)
                    end=mid-1;
                else
                    start=mid+1;

            }
            else if (nums[mid] < target) {
                // Search the right half
                start=mid+1;
                
            } else {
                // Search the left half
                end=mid-1;
            
            }
        }
        return pos;

    }

}
