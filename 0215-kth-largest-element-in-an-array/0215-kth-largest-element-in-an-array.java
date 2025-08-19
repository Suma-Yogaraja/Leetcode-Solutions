class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int num:nums){
            heap.offer(num);
            if(heap.size()>k)
                heap.poll();
        }
        // while(k>1){
        //     heap.remove();
        //     k--;
        // }
        return heap.poll();
    }
}