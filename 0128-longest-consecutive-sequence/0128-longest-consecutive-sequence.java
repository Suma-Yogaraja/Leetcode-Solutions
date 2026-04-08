class Solution {
    public int longestConsecutive(int[] nums) {
        //for every eemnt check if previous exists,if not then it is the start so check for next elements
        Set<Integer> num=new HashSet<>();
        int maxLen=0;
        for(int n:nums)
            num.add(n);
        for(int numb:num){
            if(!num.contains(numb-1)){
                //this may be start
                int leng=0;
                while(num.contains(numb)){
                    leng++;
                    numb++;
                }
                maxLen=Math.max(leng,maxLen);
            }
        }
        return maxLen;
    }
}