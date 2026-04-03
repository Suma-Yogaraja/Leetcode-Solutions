class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
       //sort ,keep one elemnt and do 2 sum for remainng elemnts
       Arrays.sort(nums);
       List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int start=i+1;
            int end=nums.length-1;
            while(start<end){
                
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==0){
                    ans.add(Arrays.asList(nums[start],nums[end],nums[i]));
                    while(start<end && nums[start]==nums[start+1])
                        start++;
                    while(start<end && nums[end]==nums[end-1])
                        end--;

                    start++;
                    end--;
                }
                else if(sum<0)
                    start++;
                else
                    end--;
            }
        }
        return ans;
    }
      
}