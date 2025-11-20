class Solution {
    public int countComponents(int n, int[][] edges) {
        int count=0;
        //since this is edge we might need map
        Map<Integer,List<Integer>> dict=new HashMap<>();
        for(int i=0;i<n;i++)
             dict.put(i,new ArrayList<>());
        for(int[] edge:edges){
            int x=edge[0];
            int y=edge[1];
            dict.get(x).add(y);
            dict.get(y).add(x);
        }
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i,dict,visited);
            }
        }
        return count;
    }
    private void dfs(int node,Map<Integer,List<Integer>> dict,boolean[] visited){
        if(visited[node]==true)
            return;
        visited[node]=true;
        for(int neighbour:dict.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour,dict,visited);
            }
        }
    }
}