class Solution {
    public int findMaxLength(int[] nums) {
        //replace 0 with -1
        int max=0;
        int[] prefix=new int[nums.length];
        Map<Integer,Integer> dict=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                nums[i]=-1;
            
        }
       prefix[0]=nums[0];
       for(int i=1;i<nums.length;i++)
            prefix[i]=prefix[i-1]+nums[i];
        dict.put(0,-1);
        for(int i=0;i<nums.length;i++){
            if(dict.containsKey(prefix[i]))
                 max=Math.max(max,i-dict.get(prefix[i]));
            else
                dict.put(prefix[i],i);
        }
        
         return max;
    }
}