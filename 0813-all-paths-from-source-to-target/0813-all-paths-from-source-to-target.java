class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);
        dfs(ans,path,graph,0);
        return ans;
    }
    private void dfs(List<List<Integer>> ans,List<Integer> path,int[][] graph,int node){
        if(node==graph.length-1){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int n:graph[node]){
            path.add(n);
            dfs(ans,path,graph,n);
            path.remove(path.size()-1);
        }

    }
}