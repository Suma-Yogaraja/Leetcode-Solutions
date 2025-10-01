class Solution {
    public long countSubarrays(int[] nums, int k) {
        //inverse thought,max number appears atleast k times
        int maxNum = nums[0];
        int start = 0;
        int end = 0;
        int count = 0;
        long ans = 0;
        for (int i = 1; i < nums.length; i++) {
            maxNum = Math.max(maxNum, nums[i]);
        }
        // System.out.println(maxNum);
        while (start <= end && end < nums.length) {
            //expansion
            if (nums[end] == maxNum)
                count++;
            while (count >= k) {
                ans += (nums.length - end);
                if (nums[start] == maxNum) {
                    count--;
                  
                }
                  start++;
            }
            end++;
        }
        return ans;
    }
}