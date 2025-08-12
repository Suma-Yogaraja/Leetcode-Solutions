class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        //entrance is starting point ,so add that to queue
        Queue<int[]> q = new LinkedList<>();
        int m = maze.length;
        int n = maze[0].length;
        boolean[][] visited = new boolean[m][n];
        q.offer(entrance);
        int ans = 0;
        visited[entrance[0]][entrance[1]] = true;
        int[][] dirs = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int row = current[0];
                int col = current[1];
                if ((row == 0 || col == 0 || row == m - 1 || col == n - 1) && //imp here
                        !(row == entrance[0] && col == entrance[1]))
                    return ans;
                for (int[] dir : dirs) {
                    int nextRow = row + dir[0];
                    int nextCol = col + dir[1];
                    if (nextRow >= 0 && nextCol >= 0 && nextRow < m && nextCol < n &&
                     maze[nextRow][nextCol] != '+' && !visited[nextRow][nextCol]) {

                        visited[nextRow][nextCol] = true;
                        q.offer(new int[] { nextRow, nextCol });
                     }
                }     
            }
             ans++;
        }
        return -1;
    }
}