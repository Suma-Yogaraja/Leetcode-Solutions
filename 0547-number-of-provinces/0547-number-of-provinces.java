class Solution {
    Map<Integer,List<Integer>> graph=new HashMap<>();
    boolean[] seen;
    public int findCircleNum(int[][] isConnected) {
        //convert matrix to adj list to get a graph
        int n=isConnected.length;
        for(int i=0;i<n;i++){
         if(!graph.containsKey(i))
            graph.put(i,new ArrayList<>());
         for(int j=i+1;j<n;j++){
            if(!graph.containsKey(j))
                graph.put(j,new ArrayList<>());
            if(isConnected[i][j]==1){
                graph.get(i).add(j);
                graph.get(j).add(i);
            }
         }
        }
    //create a boolean array and make eveything as false 
     seen= new boolean[n];
     int ans=0;
     for(int i=0;i<n;i++){
        if(!seen[i]){//if false , we have not traveres that node before
            ans++;
            seen[i]=true;
            dfs(i);
        }
     }
        return ans;
    }
        void dfs(int i){
            for(int neighbour:graph.get(i)){
                if(!seen[neighbour]){
                    seen[neighbour]=true;
                    dfs(neighbour);
                }
            }
        }

     
}