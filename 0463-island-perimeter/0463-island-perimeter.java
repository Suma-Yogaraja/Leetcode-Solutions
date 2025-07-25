class Solution {
    int perimeter;
    boolean[][] visited;
    int m;
    int n;
    public int islandPerimeter(int[][] grid) {
         m = grid.length;
         n = grid[0].length;
        perimeter = 0;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dfs(grid, i, j);
                    break;
                }
            }
        }

        return perimeter;
    }
    void dfs(int[][] grid,int row,int col){
        if(row<0 || col<0||row>=m || col>=n || grid[row][col]==0){
            perimeter++;
            return;
        }
        if(visited[row][col])
            return;
        visited[row][col]=true;
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);

    }
}