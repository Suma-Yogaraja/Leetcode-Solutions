class Solution {
    public int subarraySum(int[] nums, int k) {
        //prefix sum [1,2,3]: count[0:1,1:3]
        int currSum=0;
        int count=0;
        Map<Integer,Integer> prefix=new HashMap<>();
        prefix.put(0,1);
        for(int num:nums){
            currSum+=num;
            count+=prefix.getOrDefault(currSum-k,0);
            prefix.put(currSum,prefix.getOrDefault(currSum,0)+1);
        }
        return count;
    }
}












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