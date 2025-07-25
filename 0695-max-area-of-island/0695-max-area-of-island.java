class Solution {
    boolean[][] visited;
    int maxArea;
    int m;
    int n;

    public int maxAreaOfIsland(int[][] grid) {
        maxArea = 0;
        int area;
        m = grid.length;
        n = grid[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    //there is an island here
                    area = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }

    int dfs(int[][] grid, int row, int col) {
        int area = 0;
       
        if (col < 0 || col >= n || row < 0 || row >= m || grid[row][col] == 0 || visited[row][col]) {
            return 0;
        }
        
        visited[row][col] = true;
        area++;
        area += dfs(grid, row + 1, col);
        area += dfs(grid, row - 1, col);
        area += dfs(grid, row, col + 1);
        area += dfs(grid, row, col - 1);
        // System.out.println(area);
        return area;
    }
}