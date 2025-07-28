class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi = 0;
        if (nums.length == 0)
            return 0;
        int s = 0;
        int e = 0;
        while (e < nums.length) {
            if (s <= e && nums[e] != 0) {
                e++;

            }

            else {
                e++;
               s=e;
            }

            maxi = Math.max(maxi, e - s);
        }
        return maxi;
    }
}