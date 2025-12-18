class Solution {
    public int[] twoSum(int[] nums, int target) {
        //hasmap elemnt ,
        Map<Integer,Integer> dict=new HashMap<>();
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(dict.containsKey(diff)){
                //add key index and present index
                ans[0]=dict.get(diff);
                ans[1]=i;
                break;
            }
            else{
                dict.put(nums[i],i);
            }
        }
        return ans;
    }
}