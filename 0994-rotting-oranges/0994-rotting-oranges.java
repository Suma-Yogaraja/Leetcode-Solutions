class Solution {
    int m;
    int n;

    public int orangesRotting(int[][] grid) {
        //bfs way of spreading rottten oranges
        int[][] direction = new int[][] { { 0, 1 }, { 1, 0 }, { -1, 0 }, { 0, -1 } };
        int totalMin = 0;
        m = grid.length;
        n = grid[0].length;
        int totalOrange = 0;
        int rottenOrange = 0;
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                    rottenOrange++;
                }
                if (grid[i][j] != 0)
                    totalOrange++;
            }
        }
        //    System.out.println(totalOrange + " rotten is : " +rottenOrange);
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottedThisMinute = false;
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for (int[] dir : direction) {
                    int nextR = dir[0] + r;
                    int nextC = dir[1] + c;
                    if (isValid(nextR, nextC, grid) && grid[nextR][nextC] == 1) {
                        grid[nextR][nextC] = 2;
                        rottenOrange++;
                        rottedThisMinute = true;
                        q.add(new int[] { nextR, nextC });
                    }
                }
            }
            if (rottedThisMinute)
                totalMin++;
        }

        return rottenOrange == totalOrange ? totalMin : -1;

    }

    private boolean isValid(int row, int col, int[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n;
    }
}