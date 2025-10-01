class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        int sum=0;
        //2 sum and 3 sum follows 2 pointer
        //here first we sort the array and we keep one elemnt and do two pointer for the rest
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){//when i exceeds lenth-2,we can no longer get triplet
            //skip dup;icate
            if(i>0 && nums[i]==nums[i-1])  
                continue;
            int first=i+1;
            int last=nums.length-1;
            while(first<last){
                //find sum
                sum=nums[i]+nums[first]+nums[last];
                //if sum==0,add elemnts to res list
                if(sum==0){
                    res.add(Arrays.asList(nums[i],nums[first],nums[last]));
                 //find uniqness
                 while(first<last && nums[first]==nums[first+1])
                    first++;
                 while(first<last && nums[last]==nums[last-1])
                    last--;
                first++;
                last--;
                }
                else if(sum<0)
                    first++;
                else 
                    last--;
            }
        }     
        return res;
    }
}