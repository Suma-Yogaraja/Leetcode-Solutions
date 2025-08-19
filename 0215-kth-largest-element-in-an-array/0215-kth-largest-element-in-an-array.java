class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums){
            heap.offer(num);
        }
        while(k>1){
            heap.remove();
            k--;
        }
        return heap.remove();
    }
}