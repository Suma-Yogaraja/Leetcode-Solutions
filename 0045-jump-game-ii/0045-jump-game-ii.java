class Solution {
    public int jump(int[] nums) {
        int end=0;//end of the jump
        int jump=0;
        int maxIndex=0;
        for(int i=0;i<nums.length-1;i++){
            maxIndex=Math.max(maxIndex,i+nums[i]);
            if(i==end){//current index is how far we reach 
                jump++;
                end=maxIndex;
            }
        }
        return jump;
    }
}