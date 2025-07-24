class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set =new HashSet<>();
        int small=1;
        for(int num:nums){
            if(num>0)
              set.add(num);
        }
            while(set.contains(small))
                small++;
        return small;
    }
}