class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        //use hashmap like num:index
        Map<Integer,Integer> dict=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(dict.containsKey(diff)){
                res[0]=i;
                res[1]=dict.get(diff);
            }
            else
                dict.put(nums[i],i);

        }
        return res;

    }
}