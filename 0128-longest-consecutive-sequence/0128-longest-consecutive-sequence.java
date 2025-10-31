class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        int length=0;
        int maxLength=0;
        for(int num:nums)
            seen.add(num);
        for(int num:seen){
            if(!seen.contains(num-1)){
                length=1;
                int i=1;
                while(seen.contains(num+i)){
                    length++;
                    i++;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}