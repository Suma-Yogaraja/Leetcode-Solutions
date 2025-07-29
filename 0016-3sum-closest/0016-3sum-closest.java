class Solution {
    public int threeSumClosest(int[] nums, int target) {
        //here problem is similar to 3sum
        if (nums.length == 0)
            return -1;
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);//-4,-1,1,2
        int closest = nums[0] + nums[1] + nums[2];
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int first = i + 1;
            int last = nums.length - 1;
            while (first < last) {
                sum = nums[i] + nums[first] + nums[last];
                //System.out.println(sum);
                if (sum == target)
                    return sum;
                if (Math.abs(sum - target) < Math.abs(closest - target))
                    closest = sum;
                if (sum < target)
                    first++;
                else
                    last--;
                
            }
        }
        return closest;
    }
}