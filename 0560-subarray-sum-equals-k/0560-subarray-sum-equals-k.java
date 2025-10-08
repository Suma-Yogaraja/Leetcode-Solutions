class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums.length==0)
            return 0;
        //Prefix+hashMap
        Map<Integer,Integer> freq=new HashMap<>();
        int[] prefix=new int[nums.length];
        int i=0;
        int ans=0;
        int currSum=0;
        freq.put(0,1);
        for(i=0;i<nums.length;i++){
            currSum+=nums[i];
            // System.out.println(currSum);
            if(freq.containsKey(currSum-k)){
                ans+=freq.get(currSum-k);
            }
            freq.put(currSum,freq.getOrDefault(currSum,0)+1);
        }
        return ans;
    }
}