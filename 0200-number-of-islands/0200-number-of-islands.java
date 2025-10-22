class Solution {
    int[][] direction=new int[][]{{0,1},{-1,0},{1,0},{0,-1}};
    boolean[][] visited;
    int isLand;
    int m;
    int n;
    public int numIslands(char[][] grid) {
         m=grid.length;
         n=grid[0].length;
        isLand=0;
        visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    
                    dfs(grid,i,j);
                    isLand++;
                }
            }
        }
        return isLand;

    }
    private void dfs(char[][] grid,int row,int col){
        visited[row][col]=true;
        for(int[] dir:direction){
            int nextX=dir[0]+row;
            int nextY=dir[1]+col;
            if(isValid(nextX,nextY,grid) && !visited[nextX][nextY]){
                visited[nextX][nextY]=true;
                dfs(grid,nextX,nextY);
            }
        }
    }
    private boolean isValid(int row,int col,char[][] grid){
        return 0<=row && row<m && col>=0 && col<n && grid[row][col]=='1';
    }
}