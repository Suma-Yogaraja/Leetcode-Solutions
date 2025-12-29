class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k == 0) 
            return new int[0];
        List<Integer> ans = new ArrayList<>();
        //heap of value,index
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);//max heap with value in descending order
        for (int end = 0; end < nums.length; end++) {
            pq.add(new int[] { nums[end], end });
            int start = end - k + 1;

            while (!pq.isEmpty() && pq.peek()[1] < start) {
                //check start and shrink
                pq.poll();

            }
            if (end>=k-1) {
                ans.add(pq.peek()[0]);
            }

        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}