class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        //do bfs,while doing so , we will get riddle and we know target
        //start from target and go to it neighbour and find out 
        Queue<int[]> q = new LinkedList<>();
        //int[][] ans=new int[rows][cols];
        List<int[]> result = new ArrayList<>();
        q.offer(new int[] { rCenter, cCenter });
        result.add(new int[]{rCenter,cCenter});
        boolean[][] visited = new boolean[rows][cols];
        visited[rCenter][cCenter]=true;
        int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] cell = q.poll();
                int r = cell[0];
                int c = cell[1];
                for (int[] dir : dirs) {
                    int nextR = r + dir[0];
                    int nextC = c + dir[1];
                    //valid boundry
                    if (nextR >= 0 && nextC >= 0 && nextR < rows && nextC < cols && !visited[nextR][nextC]) {
                        visited[nextR][nextC] = true;
                        //add index to result array
                        result.add(new int[] { nextR, nextC });
                        q.offer(new int[] { nextR, nextC });

                    }

                }

            }
        }
        int[][] resArray = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }

}