class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //here intution is start with source node and keep on checking its neighbours node,in the process if destination is encountered then there is a valid path
        Map<Integer,List<Integer>> graph=new HashMap<>();
        for(int i=0;i<n;i++){
            graph.put(i,new ArrayList<>());
        }
        for(int[] edge:edges){
            int from=edge[0];
            int to=edge[1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        boolean[] visited=new boolean[n];
        visited[source]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination)
                return true;
            for(int neighbour:graph.get(node))
            {
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return false;
    }
}