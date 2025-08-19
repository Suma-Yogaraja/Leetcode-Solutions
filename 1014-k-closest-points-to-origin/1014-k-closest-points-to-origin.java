class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //use priority queue
        PriorityQueue<int[]> heap=new PriorityQueue<>(
            (a,b)->Integer.compare(distance(b),distance(a))
            );

        for(int[] point:points){
            heap.offer(point);
            if(heap.size()>k)
                heap.poll();
        }

        int[][] closest=new int[k][2];
        for(int i=0;i<k;i++){
            closest[i]=heap.poll();
        }
        return closest;

    }
    private int distance(int[] point){
            return point[0]*point[0]+point[1]*point[1];
    }
}