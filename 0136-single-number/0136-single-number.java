class Solution {
    public int singleNumber(int[] nums) {
        //3 ways to do ,one using hash map,other sorting and checking and other is XOR
        //since XOR is associative we can use that concept to find a single number
        if(nums.length<=1)
            return nums[nums.length-1];
        int result=0;
        for(int num:nums){
            result=result ^ num;
        }
        return result;
    }
}













    //     Map<Integer,Integer> seen=new HashMap<>();
    //     for(int i:nums)
    //         seen.put(i,seen.getOrDefault(i,0)+1);

    //     for(Map.Entry<Integer,Integer> entry:seen.entrySet())
    //         if(entry.getValue()==1)
    //          return entry.getKey();


    // return -1;


        // Arrays.sort(nums);
        // if(nums.length ==1 || nums.length==0)
        //     return nums[nums.length-1];
        // for(int i=0;i<(nums.length-1);i=i+2)
        // {
        //     if(nums[i]!=nums[i+1]) 
        //         return nums[i];
        


        // }
        // return nums[nums.length-1];
        
//     }
// }