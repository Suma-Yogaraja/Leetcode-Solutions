class SeatManager {
    PriorityQueue<Integer> minHeap;

    public SeatManager(int n) {
        minHeap=new PriorityQueue<>();
        for(int i=1;i<=n;i++){
            minHeap.offer(i);
        }
    }
    
    public int reserve() {
        if(!minHeap.isEmpty())
            return minHeap.poll();
        return 0;
    }
    
    public void unreserve(int seatNumber) {
        minHeap.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */