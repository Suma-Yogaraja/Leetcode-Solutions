class Solution {
    public int orangesRotting(int[][] grid) {
        //here using bfs since orange is rooting in ripple way
        //taking queue and adding all the rotten oranges,
        Queue<int[]> q=new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int[][] dirs=new int[][]{{0,-1},{0,1},{1,0},{-1,0}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                    visited[i][j]=true;
                }
            }
        }
        int minute=0;
        //starting bfs simutlaneously from all rotten orange
        while(!q.isEmpty()){
            boolean isRotten=false;
            int size=q.size();
            for(int k=0;k<size;k++){
                int[] cell=q.poll();
                int row=cell[0];
                int col=cell[1];
                for(int[] dir:dirs){
                    int nextR=row+dir[0];
                    int nextC=col+dir[1];
                    //make sure orange is not rotten and is within grid boundry
                    if(nextR>=0 && nextC>=0 && nextR<m && nextC<n && grid[nextR][nextC]==1  
                       && !visited[nextR][nextC]){
                            visited[nextR][nextC]=true;
                            grid[nextR][nextC]=2;
                            q.offer(new int[]{nextR,nextC});
                            isRotten=true;

                    }
                }
            }
            if(isRotten)
                minute++;               
        }
        //we have send no of levels of traversal
        for(int a=0;a<m;a++){
            for(int b=0;b<n;b++){
                if(grid[a][b]==1)
                    return -1;
            }
        }

        return minute;
    }
}