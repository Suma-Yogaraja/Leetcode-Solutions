class Solution {
    public int[][] kClosest(int[][] points, int k) {
        //d=sqrt(x2 + y2)
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a,b)-> (b[1]-a[1])
        );
        for(int i=0;i<points.length;i++){

            int x=points[i][0];
            int y=points[i][1];
            int result=(x*x) +(y*y);
            pq.add(new int[]{i,result});
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] result=new int[k][2];
        int idx=0;
        while(!pq.isEmpty()){
            int index=pq.poll()[0];
            result[idx++] = points[index];
        }
        return result;
    }
}