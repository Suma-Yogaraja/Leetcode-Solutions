class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length<=1)
         return;
         int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
       
        while(j<nums.length){
            nums[j++]=0;
        }
    }
}













//             if(nums.length==1)
//             return;

//             int left=0,right=0,n=nums.length;

//             while(right<n){
//                 if(nums[right]==0){
//                     right++;
//                 }
//                 else {
//                     if(nums[right]!=0 && nums[left]==0){
//                         int temp=nums[left];
//                         nums[left]=nums[right];
//                         nums[right]=temp;
//                     }
//                     left++;
//                     right++;
//                 }
//             }
//     }
// }