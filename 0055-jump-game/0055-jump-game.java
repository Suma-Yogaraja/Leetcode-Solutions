class Solution {
    public boolean canJump(int[] nums) {
        //greedy approach

        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i>farthest)
                return false;
            
            farthest = Math.max(farthest, i + nums[i]);
           // System.out.println(farthest);
            
        }
        return true;
    }
}