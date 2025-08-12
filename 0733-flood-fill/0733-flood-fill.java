class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //first get the color of image[sr][sc],if same as target color ,no changeds made
        if (image[sr][sc] == color)
            return image;
        //if color is different,then do bfs for its neighbouring cellswith similar color and change the color
        Queue<int[]> q = new LinkedList<>();
        int m = image.length;
        int n = image[0].length;
        boolean[][] visited = new boolean[m][n];
        q.offer(new int[] { sr,sc});
        visited[sr][sc] = true;
        int prevColor = image[sr][sc];
        image[sr][sc] = color;
        int[][] dirs = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int row = cell[0];
                int col = cell[1];
                for (int[] dir : dirs) {
                    int nextR = row + dir[0];
                    int nextC = col + dir[1];
                    if (nextR >= 0 && nextC >= 0 && nextR < m && nextC < n 
                    && image[nextR][nextC] == prevColor && !visited[nextR][nextC]) {
                        visited[nextR][nextC] = true;
                        image[nextR][nextC] = color;
                        q.offer(new int[] { nextR, nextC });
                    }
                }

            }
        }
        return image;
    }
}