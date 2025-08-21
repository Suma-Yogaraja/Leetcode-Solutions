class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        //maintain two minheap for candidates 
        PriorityQueue<int[]> leftHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return (a[0] - b[0]);
            } else
                return a[1] - b[1];
        });
        PriorityQueue<int[]> rightHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return (a[0] - b[0]);
            } else
                return a[1] - b[1];
        });
        int left = 0;
        int right = costs.length - 1;
        //fill initial candidates
        for (int i = 0; i < candidates && left <= right; i++) {
            leftHeap.offer(new int[] { costs[left], left });
            left++;
        }
        for (int j = 0; j < candidates && left <= right; j++) {
            rightHeap.offer(new int[] { costs[right], right });
            right--;
        }

        long total = 0;
        while (k > 0) {
            if (!leftHeap.isEmpty() && (rightHeap.isEmpty() || leftHeap.peek()[0] <= rightHeap.peek()[0])) {
                int[] worker = leftHeap.poll();
                total += worker[0];
                if (left <= right) {
                    leftHeap.offer(new int[] { costs[left], left });
                    left++;
                }
            } else {
                int[] worker = rightHeap.poll();
                total += worker[0];
                if (left <= right) {
                    rightHeap.offer(new int[] { costs[right], right });
                    right--;
                }
            }

            k--;

        }

        return total;

    }

}