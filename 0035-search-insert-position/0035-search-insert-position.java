class Solution {
    public int searchInsert(int[] nums, int target) {
        int right=nums.length-1;
        int left=0;
        if(nums[left]>target)
         return 0;
        if(nums[right]<target)
            return right+1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                left=mid+1;
            else
             right=mid-1;
        }
        return left;
    }
}
































//         int l=0;int h=nums.length-1;
//         if(nums.length==0) return 0;
//         int mid= (l+h)/2;
//         // if(mid==0){
//         //     if(target==nums[h]) return h;
//         //     else if(target==nums[l]) return l;
//         //     else return h;

//         // }
//         //System.out.println(h);
//         //if target is less than 1st element,return index 0
//             if(target<nums[l]) return 0;
//             else if(target>nums[h]) return h+1;
            
//             while(l<=h){
//                 //System.out.println(l + ":"  + mid +":" + h );
//                 if(target==nums[mid])
//                     return mid;
//                 else if(target<nums[mid]){
//                     h=mid-1;
//                     mid= (l+h)/2;
//                 }
                
//                 else if(target>nums[mid]){
//                     l=mid+1;
//                     mid= (l+h)/2;
//                 }
                    
//             }
//             return mid + 1;
//     }
// }
