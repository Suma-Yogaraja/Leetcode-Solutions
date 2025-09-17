class Solution {
    public int missingNumber(int[] nums) {
       int missing=0;
       for(int i=0;i<=nums.length;i++)
        missing=missing^i;
        for(int num:nums)
            missing=missing^num;
        return missing;
        
    }
}

//     //     int length=nums.length;
//     //     Arrays.sort(nums);
//     //     int i=0;
//     // while(i<length){
//     //     if(nums[i]==i)
//     //          i++;
//     //     else return i;

//     // } 
//     //     return i;


//     // 
    
//     Set<Integer> numSet=new HashSet<Integer>();
//     for(int num:nums)
//         numSet.add(num);
//     for(int i=0;i<nums.length;i++)
//         {
//             if(!numSet.contains(i))
//                 return i;

//         }
//         return nums.length;

// }
// }