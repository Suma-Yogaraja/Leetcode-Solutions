class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        if(nums.length<=1 && nums[0]!=target)
            return -1;

        while(left<=right){
            int mid=left+(right-left)/2;
            // System.out.println(left + ":" + right + ": "+ mid);

            if(target==nums[mid])
                return mid;
                //case 1: not rotated 
            else if(nums[left]<=nums[mid]){
                if(target<nums[left] || target>nums[mid])
                    left=mid+1;
                else
                    right=mid-1;
            } 
            //right is sorted
            else {
                
                if(target<nums[mid] || target>nums[right])
                    right=mid-1;
                else{
                  left=mid+1;
                  System.out.println(left);
                }
            }

        }
        return -1;
    }
}






























//         int start = 0;
//         int end = nums.length - 1;
//         //find the pivot element and its index
//         //System.out.println(findPivotElement(nums));
//         int pivot=findPivotElement(nums,start,end);
//         if(pivot==-1) 
//             return binarySearch(nums,start,end,target);;
//         if(target== nums[pivot])    
//             return pivot;
//         if (nums[start] <= target) {
//             return binarySearch(nums, start, pivot - 1, target);
//         }
        
//         // Otherwise, search the right part
//         return binarySearch(nums, pivot + 1, end, target);
//     //return -1;
        
//     }

//     int findPivotElement(int[] nums,int start,int end) {
//         // int start = 0;
//         // int end = nums.length - 1;
//         if (nums[start] <= nums[end]) {
//             return -1;
//         }
//         // if (end == 0)
//         //     return nums.length - 1;
//         while (start <= end) {
//             int mid = (start + end )/ 2;
//             if (mid<end && nums[mid] > nums[mid + 1])
//                 return mid;
//             else if (mid>start &&  nums[mid] < nums[mid - 1])
//                 return mid-1;
//             else if (nums[start] >= nums[mid])
//                 end = mid - 1;
//             else
//                 start = mid+1;

//         }
//         return -1;
//     }

//     int binarySearch(int[] nums, int start, int end, int target) {

//         if (start > end) {
//             return -1;
//         }

        
//         int mid = start + (end - start) / 2;

//         // Check if the middle element is the target
//         if (nums[mid] == target) {
//             return mid; // Return the index of the target
//         }

//         // If the target is smaller than the middle element, search in the left half
//         if (nums[mid] > target) {
//             return binarySearch(nums, start, mid - 1, target);
//         }

//         // Otherwise, search in the right half
//         return binarySearch(nums, mid + 1, end, target);
//     }

// }