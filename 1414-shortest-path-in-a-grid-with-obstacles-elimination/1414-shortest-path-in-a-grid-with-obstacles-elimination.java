class Solution {
    public int shortestPath(int[][] grid, int k) {
        //visited[][][] and queue[][][][]
        int row = grid.length;
        int col = grid[0].length;
        if(k>=row+col-2)
            return row+col-2;
        Queue<int[]> q = new LinkedList<>();
        boolean[][][] visited = new boolean[row][col][k+1];//i can reach dest with 0,1 or 2 obstacles if k=2;
        int[] dirs[]={{0,1},{-1,0},{1,0},{0,-1}};
        q.offer(new int[]{0,0,0,0});//q(row,col,obstacles_used,steps)
        visited[0][0][0]=true;
        while(!q.isEmpty()){
            int[] cell=q.poll();
            int r=cell[0];
            int c=cell[1];
            int obstacles_used=cell[2];
            int steps=cell[3];
            if(r==row-1 && c==col-1)
                return steps;
            for(int[] dir:dirs){
                int nextR=r+dir[0];
                int nextC=c+dir[1];
                //we are inside grid
                if(nextR>=0 && nextR<row && nextC>=0 && nextC<col){
                    int newCell=grid[nextR][nextC];
                    int removed=obstacles_used+newCell;
                    if(removed<=k && !visited[nextR][nextC][removed]){
                        visited[nextR][nextC][removed]=true;
                        q.offer(new int[]{nextR,nextC,removed,steps+1}); 
                    }
                }
            }
        
        }
        return -1;
    }
}