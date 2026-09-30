class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //2 -> 9-2=7-> if 7 exist in map> not  then add 2 
        //7-> 9-7=2 -> if 2 exist in map> return this index along with 2 index
        //map-(number,index)

        Map<Integer,Integer> dict=new HashMap<>();
        int n=nums.length;
        int[] result=new int[2];
        for(int i=0;i<n;i++){
            if(!dict.containsKey(target-nums[i])){
                dict.put(nums[i],i);
            }
            else{
                result[0]=i;
                result[1]=dict.get(target-nums[i]);
                break;
            }
        }

        return result;
    }
}