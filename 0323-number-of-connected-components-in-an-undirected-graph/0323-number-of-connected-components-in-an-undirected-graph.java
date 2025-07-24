class Solution {

    public int countComponents(int n, int[][] edges) {
        //convert edges list to adj list 
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int count = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
         //count=0,and visted[] boolean ,for each nide, i will check whether it is visted or not,if not visited ,new compnonent,increase count anll a method dfs
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,graph,visited);
            }

        }
        return count;
       
    }
        //dfs methode check for all its neighbours and mark it. as visited
      void dfs(int node,Map<Integer, List<Integer>> graph,boolean[] visited){
        visited[node]=true;
        for(int neighbour:graph.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,graph,visited);
            }
        }
      }
}