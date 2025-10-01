class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //two pointer
        int start=0;
        int end=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                minLength=Math.min(minLength,end-start+1);
                sum-=nums[start];
                start++;
            }
           
        }
        return minLength==Integer.MAX_VALUE?0 :minLength;
    }
}



















//         int left=0;
//         int right=0;
//         int sum=0;
//         int res=Integer.MAX_VALUE;

//         for(right=0;right<nums.length;right++)
//         {   
//              sum+=nums[right];
//             while(sum>=target)
//             {
                

//                 res=Math.min(res,right-left+1);
//                 sum-=nums[left];
//                 left++;
//             }
           
//        // System.out.println(res);

//         }
    
//         return res==Integer.MAX_VALUE ? 0 : res;

//     }
// }