class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        //if grid is null or single col or row
         int row = grid.length; 
        int col = grid[0].length; 
        int ans = 1;
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return -1;
        if (grid[0][0] == 1 || grid[row - 1][col - 1] == 1)
            return -1;
        
        int[][] dirs = { { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 } };
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[row][col];
        q.offer(new int[] { 0, 0 });
        visited[0][0] = true;
        while (!q.isEmpty()) {
            int size = q.size();
            //ans++;
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                if (curr[0] == row - 1 && curr[1] == col - 1)
                    return ans;
                for (int[] dir : dirs) {
                    int nextX = curr[0] + dir[0];
                    int nextY = curr[1] + dir[1];
                    if (nextX < 0 || nextX >= row
                            || nextY < 0 || nextY >= col
                            || visited[nextX][nextY] || grid[nextX][nextY] == 1) {
                        continue;
                    }
                    visited[nextX][nextY] = true;
                    q.offer(new int[] { nextX, nextY });
                }

            }
            ans++;
        }
        return -1;
    }

}
