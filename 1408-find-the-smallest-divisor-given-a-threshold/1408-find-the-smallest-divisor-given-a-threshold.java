class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start=1;
        int end=0;
        //i think this belongs to binary search
        for(int num:nums)
            end=Math.max(end,num);    
        // System.out.println(end);
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            sum = divisor(mid, threshold, nums);
            // System.out.println("sum is " + sum +" mid is " + mid);
            if (sum > threshold) {
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    private int divisor(int div, int threshold, int[] nums) {
        int sum = 0;
        for (int num : nums) {
            // System.out.println(sum);
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }
}