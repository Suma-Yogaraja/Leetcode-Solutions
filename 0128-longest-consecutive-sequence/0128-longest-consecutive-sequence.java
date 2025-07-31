class Solution {
    public int longestConsecutive(int[] nums) {
        //first use set
        Set<Integer> seen=new HashSet<>();
        for(int j:nums){
            seen.add(j);
        }
        //int length=0;
        int maxLength=0;
        for(int num:seen){
            int length=0;
            //int inc=1;
            int curr=num;
            if(!seen.contains(curr-1)){
                length++;
                while(seen.contains(curr+1)){
                    length++;
                    curr++;
                }
                maxLength=Math.max(maxLength,length);
            }
        }
    return maxLength;
    }
}