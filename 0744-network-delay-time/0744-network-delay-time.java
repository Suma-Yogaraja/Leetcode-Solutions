class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        //Dijkstras
        //create adjacency list
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        int[] dist=new int[n+1];
        for(int[] time:times){
            int u=time[0];
            int v=time[1];
            int w=time[2];
            adj.get(u).add(new int[]{v,w});
        }
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(new int[]{k,0});
        dist[k]=0;
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int currW=curr[1];
            int currNode=curr[0];
            if(currW>dist[currNode])
                continue;
            for(int[] edge:adj.get(currNode)){
                int next=edge[0];
                int wt=edge[1];
                if(currW+wt<dist[next]){
                    dist[next]=currW+wt;
                    pq.add(new int[]{next,dist[next]});
                }
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)
                return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}