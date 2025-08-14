class Solution {
    boolean[][] visited;
    int move;
    int m;
    int n;
    int cell;
    boolean canReachBoundary;
    int[][] dirs={{0,1},{0,-1},{-1,0},{1,0}};
    public int numEnclaves(int[][] grid) {
        //here first we check for land in each grid,
        //if we encounter land,we check whether it is connected to any boundry,and check its neighbout land also
         m=grid.length;
         n=grid[0].length;
         move=0;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //check for land and 
                if(grid[i][j]==1 && !visited[i][j]){
                    canReachBoundary=false;
                    cell=0;
                    //sice there is a land,check boundry and its neighbor land
                    dfs(i,j,grid);
                    if(!canReachBoundary)
                        move+=cell;
                }
            }
        }
        return move;
    }
    void dfs(int row,int col,int[][] grid){
        //check if it is outside  boundry
        if(row<0 || col>=n || row>=m || col<0){
            canReachBoundary=true;
            return;
        }
         if(grid[row][col]==1 && !visited[row][col]){
            cell++;
            visited[row][col]=true;
            dfs(row+1,col,grid);
            dfs(row-1,col,grid);
            dfs(row,col-1,grid);
            dfs(row,col+1,grid);
        }
    }
}