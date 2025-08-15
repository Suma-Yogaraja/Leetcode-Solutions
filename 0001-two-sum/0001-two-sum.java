class Solution {
    public int[] twoSum(int[] nums, int target) {
        //use hashmap key as number and value as its index
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{i,map.get(target-nums[i])};
            else
                map.put(nums[i],i);
        }
            return new int[]{-1,-1};
    }
}
















//         //take a hashmpa,key as number and value as index
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(target-nums[i])){
//                 return new int[]{i,map.get(target-nums[i])};
//             }
//             else{
//                 map.put(nums[i],i);
//             }

//         }
//         return new int[]{-1,-1};
//     }
// }