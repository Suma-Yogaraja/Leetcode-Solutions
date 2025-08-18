class Solution {
    public int connectSticks(int[] sticks) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        if (sticks == null || sticks.length <= 1) {
            return 0;
        }

        for (int stick : sticks)
            heap.add(stick);
        int total = 0;
        while (heap.size() > 1) {
            int first = heap.poll();
            int second = heap.poll();
            total += first + second;
            heap.offer(first + second);
        }
        return total;
    }
}