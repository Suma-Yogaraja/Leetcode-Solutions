class Solution {
    public int rob(int[] nums) {
        int[] maxSoFar=new int[nums.length];
        int n=nums.length;
        //since asked for aadjacent first two house max is same as nums
        if(n<1)
            return 0;
        if(n<2){
           return nums[0];
        }
        else{
            maxSoFar[0]=nums[0];
            maxSoFar[1]=Math.max(nums[0],nums[1]);
             System.out.println(maxSoFar[0]);
        }
        for(int i=2;i<nums.length;i++){
                maxSoFar[i]=Math.max(nums[i]+maxSoFar[i-2],maxSoFar[i-1]);
                System.out.println(maxSoFar[i]);
        }
        return Math.max(maxSoFar[n-1],maxSoFar[n-2]);
    }
}