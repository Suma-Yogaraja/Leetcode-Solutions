class MedianFinder {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    public MedianFinder() {
        left=new PriorityQueue<>(Comparator.reverseOrder());
        right=new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        //check whether the num is less than root of left ,maxHeap
        if(left.isEmpty() || num<=left.peek()){
            left.offer(num);
        }
        else{
            right.offer(num);
        }
        //balance the heap size
        if(left.size()>right.size()+1){
            right.offer(left.poll());
        }
        else if(right.size()>left.size()){
            left.offer(right.poll());
        }
    }
    
    public double findMedian() {
        //if even length array
        if(left.size()==right.size()){
            return (left.peek()+right.peek())/2.0;
        }
        else
         return left.peek();//left has always one extra elemnt if odd 
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */