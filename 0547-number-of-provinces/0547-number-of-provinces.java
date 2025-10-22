class Solution {
    int[] parent;
    int count;
    public int findCircleNum(int[][] isConnected) {
        //this can be solved using dfs or union set
        parent=new int[isConnected.length];
        count=isConnected.length;
        for(int i=0;i<isConnected.length;i++)
            parent[i]=i;
        for(int i=0;i<isConnected.length;i++){
            for(int j=i+1;j<isConnected.length;j++){
                if(isConnected[i][j]==1){
                    union(i,j);
             
                } 
            }
        }
        // System.out.println(count);
            return count;
    }
    private void union(int i,int j){
            int px=find(i);
            int py=find(j);
            if(px!=py){
                parent[py]=px;
                count--;
            }
            else
            return;
    }
    private int find(int x){
        if(parent[x]==x)
            return x;
        return find(parent[x]);
    }
}