class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] ans=new int[queries.length];
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                count++;
                map.put(count,i);
            }
        }
       for(int i=0;i<queries.length;i++){
            if(map.containsKey(queries[i]) & queries[i]<nums.length)
                ans[i]=map.get(queries[i]);
            else
                ans[i]=-1;
       }
        return ans;
    }
}