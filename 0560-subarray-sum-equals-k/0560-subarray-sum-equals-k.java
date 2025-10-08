class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0)
            return 0;
        //Prefix+hashMap
        Map<Integer,Integer> freq=new HashMap<>();
        int[] prefix=new int[nums.length];
        int i=0;
        int ans=0;
        prefix[0]=nums[0];
        for(i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        freq.put(0,0);
        for(i=0;i<nums.length;i++){
            freq.put(prefix[i],freq.getOrDefault(prefix[i],0)+1);
            if(freq.containsKey(prefix[i]-k)){
                ans++;
            }
            
        }
        return ans;
    }
}






















//         //prefix sum [1,2,3]: count[0:1,1:3]
//         int currSum=0;
//         int count=0;
//         Map<Integer,Integer> prefix=new HashMap<>();
//         prefix.put(0,1);
//         for(int num:nums){
//             currSum+=num;
//             count+=prefix.getOrDefault(currSum-k,0);
//             prefix.put(currSum,prefix.getOrDefault(currSum,0)+1);
//         }
//         return count;
//     }
// }












//         //use prefixsum
//          Map<Integer,Integer> count=new HashMap<>();
//         int ans=0,currsum=0;
//         count.put(0,1);
//         for(int num:nums){
//             currsum+=num;
//             ans+=count.getOrDefault(currsum-k,0);
//             count.put(currsum,count.getOrDefault(currsum,0)+1);
//             //System.out.println(ans);

//         }
//      return ans;        
//     }
// }