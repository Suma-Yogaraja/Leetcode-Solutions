class Solution {
    int count;
    int[] parent;
    public int countComponents(int n, int[][] edges) {
        count=n;
        //union find
        parent=new int[n];
        for(int i=0;i<n;i++)
            parent[i]=i;
        for(int[] edge:edges){
            int x=edge[0];
            int y=edge[1];
            union(x,y);
        }
        return count;
    }
    private void union(int x,int y){
            int px=find(x);
            int py=find(y);
            if(px==py)
                return;
            else{
                parent[px]=find(py);
                count--;
            }
            return;
    }
    private int find(int x){
        if(parent[x]==x)
            return x;
        return find(parent[x]);
    }
}