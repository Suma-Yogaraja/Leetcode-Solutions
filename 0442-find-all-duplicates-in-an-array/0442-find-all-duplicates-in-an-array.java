class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                ans.add(num);
            }
            set.add(num);
        }
        return ans;

    }
}