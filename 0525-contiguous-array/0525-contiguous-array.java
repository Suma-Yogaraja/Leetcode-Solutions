class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> prefixSum=new HashMap<>();
        prefixSum.put(0,-1);
        int sum=0;
        int maxLength=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(n==0)
                sum-=1;
            else
                sum+=1;
            if(prefixSum.containsKey(sum)){
                maxLength=Math.max(maxLength,i-prefixSum.get(sum));
            }
            else{
                prefixSum.put(sum,i);
            }
        }
        return maxLength;

    }
}